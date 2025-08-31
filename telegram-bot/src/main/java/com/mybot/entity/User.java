package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users_telegram")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "telegram_id", unique = true)
    private Long telegramId;

    private String username;

    @Column(name = "referral_code")
    private String referralCode;

    @Column(name = "referrer_id")
    private Long referrerId;

    // Getters and Setters
    public Long getId() { return id; }
    public Long getTelegramId() { return telegramId; }
    public void setTelegramId(Long telegramId) { this.telegramId = telegramId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getReferralCode() { return referralCode; }
    public void setReferralCode(String referralCode) { this.referralCode = referralCode; }
    public Long getReferrerId() { return referrerId; }
    public void setReferrerId(Long referrerId) { this.referrerId = referrerId; }
}
