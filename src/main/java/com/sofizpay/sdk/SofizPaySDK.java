package com.sofizpay.sdk;

/**
 * Convenient short-name alias for SofizPayStellarSDK
 */
public class SofizPaySDK extends SofizPayStellarSDK {
    public SofizPaySDK() {
        super(false, false);
    }

    public SofizPaySDK(boolean useTestnet) {
        super(useTestnet, useTestnet);
    }

    public SofizPaySDK(boolean useTestnet, boolean isSandbox) {
        super(useTestnet, isSandbox);
    }
}
