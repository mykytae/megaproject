package com.megaproject.dao;

import com.megaproject.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by nik on 14.11.2016.
 */
public interface HistoryDao extends JpaRepository<History, Integer> {
    public List<History> findByUserId (int userId);
    public List<History> findByBankAccount(String BankAccount);
}
