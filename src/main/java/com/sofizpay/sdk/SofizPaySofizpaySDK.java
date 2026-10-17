package com.sofizpay.sdk;

/**
 * Backward-compatibility wrapper for SofizPayStellarSDK
 * Resolves documentation naming discrepancy.
 */
public class SofizPaySofizpaySDK extends SofizPayStellarSDK {
    public SofizPaySofizpaySDK() {
        super(false, false);
    }

    public SofizPaySofizpaySDK(boolean useTestnet) {
        super(useTestnet, useTestnet);
    }

    public SofizPaySofizpaySDK(boolean useTestnet, boolean isSandbox) {
        super(useTestnet, isSandbox);
    }
}
