package com.sha.springbootbookseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

	@Autowired
	private IPurchaseHistoryRepository purchaseHistoryRepository;
	
	@Override
	public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
		purchaseHistory.setPurchaseTime(LocalDateTime.now());
		return purchaseHistoryRepository.save(purchaseHistory);
	}
	
	@Override
	public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId){
		return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
	}
}
