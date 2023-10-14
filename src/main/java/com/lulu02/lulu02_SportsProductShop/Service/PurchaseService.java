package com.lulu02.lulu02_SportsProductShop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu02.lulu02_SportsProductShop.Entity.Purchase;
import com.lulu02.lulu02_SportsProductShop.Repository.PurchaseRepository;

@Service
public class PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;

	public List<Purchase> getAllPurchases() {
		return purchaseRepository.findAll();
	}

	public Optional<Purchase> getPurchaseById(Long id) {
		return purchaseRepository.findById(id);
	}

	public Purchase addPurchase(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	public void deletePurchase(Long id) {
		purchaseRepository.deleteById(id);
	}
}
