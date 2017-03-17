package com.megaproject.service;

import com.megaproject.entity.History;

import java.util.List;

public interface HistoryService {

    public History create(History history);

    public List findByUserId(int userId);

    public List findByBankAccountId(int bankAccountId);

    public String generateDate();
}
