package com.sha.springbootbookseller.service;

import java.util.List;

import com.sha.springbootbookseller.model.PurchaseHistory;
import com.sha.springbootbookseller.repository.projection.IPurchaseItem;

public interface IPurchaseHistoryService {

	PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

	List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);

}
