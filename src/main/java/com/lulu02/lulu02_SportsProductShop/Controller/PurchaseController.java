package com.lulu02.lulu02_SportsProductShop.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu02.lulu02_SportsProductShop.Entity.Purchase;
import com.lulu02.lulu02_SportsProductShop.Service.PurchaseService;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;

	@GetMapping
	public List<Purchase> getAllPurchases() {
		return purchaseService.getAllPurchases();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Purchase> getPurchaseById(@PathVariable Long id) {
		Optional<Purchase> purchase = purchaseService.getPurchaseById(id);
		return purchase.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Purchase> addPurchase(@RequestBody Purchase purchase) {
		Purchase addedPurchase = purchaseService.addPurchase(purchase);
		return ResponseEntity.ok(addedPurchase);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePurchase(@PathVariable Long id) {
		purchaseService.deletePurchase(id);
		return ResponseEntity.ok("Purchase deleted successfully");
	}
}
