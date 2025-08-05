package com.ali.user.open.ucc.biz;

import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.broadcast.LoginAction;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.data.DataRepository;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastHelper;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccUnbindPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile UccUnbindPresenter instance;
    public String PASSPORT_PREFERENCE = "passport_preference";

    static {
        kge.a(-950094285);
    }

    public static /* synthetic */ void access$000(UccUnbindPresenter uccUnbindPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2d3d9d", new Object[]{uccUnbindPresenter, str});
        } else {
            uccUnbindPresenter.sendUnBindBroadcast(str);
        }
    }

    public static UccUnbindPresenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccUnbindPresenter) ipChange.ipc$dispatch("2488c460", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccUnbindPresenter.class) {
                if (instance == null) {
                    instance = new UccUnbindPresenter();
                }
            }
        }
        return instance;
    }

    private void sendUnBindBroadcast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7957894", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tlsite", str);
        Intent intent = new Intent();
        intent.setAction(LoginAction.NOTIFY_SNS_UNBIND.name());
        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
        }
        UccBroadcastHelper.sendBroadcast(intent);
    }

    public void doUnbind(final UccParams uccParams, final String str, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e5def9", new Object[]{this, uccParams, str, uccCallback});
        } else {
            DataRepository.unbind(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccUnbindPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    rpcResultlHit(rpcResponse.code + "");
                    if (rpcResponse == null) {
                        return;
                    }
                    if (TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                        ((UccService) AliMemberSDK.getService(UccService.class)).logout(KernelContext.getApplicationContext(), str);
                        try {
                            if ("weibo".equals(str)) {
                                UccUnbindPresenter.access$000(UccUnbindPresenter.this, "sina");
                                KernelContext.getApplicationContext().getSharedPreferences(UccUnbindPresenter.this.PASSPORT_PREFERENCE, 0).edit().putString("sina_sns_info", "").apply();
                            } else {
                                UccUnbindPresenter.access$000(UccUnbindPresenter.this, str);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        if (uccCallback == null) {
                            return;
                        }
                        uccCallback.onSuccess(str, new HashMap());
                        return;
                    }
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(str, Utils.buidErrorCode(rpcResponse, 1009), Utils.buidErrorMessage(rpcResponse, "解绑失败"));
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1009);
                    rpcResultlHit(buidErrorCode + "");
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "解绑失败"));
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1009);
                    rpcResultlHit(buidErrorCode + "");
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "解绑失败"));
                }

                private void rpcResultlHit(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b6096ba", new Object[]{this, str2});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", str2);
                    UTHitUtils.send(UTHitConstants.PageUccUnBind, "UccUnbind_Invoke_Result", uccParams, hashMap);
                }
            });
        }
    }
}
