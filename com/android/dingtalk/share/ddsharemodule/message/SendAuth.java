package com.android.dingtalk.share.ddsharemodule.message;

import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import tb.kge;

/* loaded from: classes3.dex */
public class SendAuth {
    static {
        kge.a(161008707);
    }

    /* loaded from: classes3.dex */
    public static class Resp extends BaseResp {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TAG = "SendDDAuth.Resp";
        public String code;
        public String state;

        static {
            kge.a(-964852815);
        }

        public static /* synthetic */ Object ipc$super(Resp resp, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -738107024) {
                super.toBundle((Bundle) objArr[0]);
                return null;
            } else if (hashCode != 864909985) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.fromBundle((Bundle) objArr[0]);
                return null;
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return 100;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public void toBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
                return;
            }
            super.toBundle(bundle);
            if (bundle == null) {
                return;
            }
            bundle.putString(ShareConstant.EXTRA_SEND_AUTH_CODE, this.code);
            bundle.putString(ShareConstant.EXTRA_SEND_AUTH_STATE, this.state);
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseResp
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
                return;
            }
            super.fromBundle(bundle);
            if (bundle == null) {
                return;
            }
            this.code = bundle.getString(ShareConstant.EXTRA_SEND_AUTH_CODE, null);
            this.state = bundle.getString(ShareConstant.EXTRA_SEND_AUTH_STATE, null);
        }
    }

    /* loaded from: classes3.dex */
    public static class Req extends BaseReq {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int LENGTH_LIMIT = 1024;
        private static final int MIN_SUPPORT_VERSION = 20160101;
        public static final String SNS_LOGIN = "sns_login";
        private static final String TAG = "SendDDAuth.Req";
        public String scope;
        public String state;

        static {
            kge.a(-1139502947);
        }

        public static /* synthetic */ Object ipc$super(Req req, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -738107024) {
                super.toBundle((Bundle) objArr[0]);
                return null;
            } else if (hashCode != 864909985) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.fromBundle((Bundle) objArr[0]);
                return null;
            }
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public int getSupportVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
            }
            return 20160101;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public int getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
            }
            return 100;
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public void toBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4016170", new Object[]{this, bundle});
                return;
            }
            super.toBundle(bundle);
            if (bundle == null) {
                return;
            }
            bundle.putString(ShareConstant.EXTRA_SEND_AUTH_SCOPE, this.scope);
            bundle.putString(ShareConstant.EXTRA_SEND_AUTH_STATE, this.state);
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public void fromBundle(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("338d7aa1", new Object[]{this, bundle});
                return;
            }
            super.fromBundle(bundle);
            if (bundle == null) {
                return;
            }
            this.scope = bundle.getString(ShareConstant.EXTRA_SEND_AUTH_SCOPE, null);
            this.state = bundle.getString(ShareConstant.EXTRA_SEND_AUTH_STATE, null);
        }

        @Override // com.android.dingtalk.share.ddsharemodule.message.BaseReq
        public boolean checkArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
            }
            String str = this.scope;
            if (str != null && str.length() != 0 && this.scope.length() <= 1024) {
                String str2 = this.state;
                if (str2 == null || str2.length() <= 1024) {
                    return true;
                }
                Log.e(TAG, "checkArgs fail, state is invalid");
                return false;
            }
            Log.e(TAG, "checkArgs fail, scope is invalid");
            return false;
        }
    }
}
