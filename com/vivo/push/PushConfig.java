package com.vivo.push;

/* loaded from: classes9.dex */
public class PushConfig {
    private boolean mAgreePrivacyStatement;
    private boolean mOpenMultiUser;

    /* loaded from: classes9.dex */
    public static final class Builder {
        private boolean mAgreePrivacyStatement = true;
        private boolean mOpenMultiUser = false;

        public final Builder agreePrivacyStatement(boolean z) {
            this.mAgreePrivacyStatement = z;
            return this;
        }

        public final PushConfig build() {
            return new PushConfig(this);
        }

        public final Builder openMultiUserMode(boolean z) {
            this.mOpenMultiUser = z;
            return this;
        }
    }

    private PushConfig(Builder builder) {
        this.mAgreePrivacyStatement = true;
        this.mOpenMultiUser = false;
        this.mAgreePrivacyStatement = builder.mAgreePrivacyStatement;
        this.mOpenMultiUser = builder.mOpenMultiUser;
    }

    public boolean isAgreePrivacyStatement() {
        return this.mAgreePrivacyStatement;
    }

    public boolean isOpenMultiUser() {
        return this.mOpenMultiUser;
    }
}
