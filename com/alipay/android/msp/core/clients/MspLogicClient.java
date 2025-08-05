package com.alipay.android.msp.core.clients;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.Action;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.NetAction;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.alipay.android.msp.drivers.dipatchers.Call;
import com.alipay.android.msp.drivers.dipatchers.MspDispatcher;
import com.alipay.android.msp.drivers.dipatchers.RealCall;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class MspLogicClient implements Call.Factory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MspDispatcher f4505a;
    private final ReentrantLock b = new ReentrantLock();
    public final int mBizId;
    public MspContext mMspContext;

    public MspLogicClient(MspContext mspContext) {
        this.f4505a = new MspDispatcher(mspContext);
        this.mBizId = mspContext.getBizId();
        this.mMspContext = mspContext;
    }

    public MspDispatcher dispatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspDispatcher) ipChange.ipc$dispatch("93b9d85a", new Object[]{this}) : this.f4505a;
    }

    public ReentrantLock getUiLock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantLock) ipChange.ipc$dispatch("106f7f50", new Object[]{this}) : this.b;
    }

    public MspContext getMspContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("a6abce0a", new Object[]{this}) : this.mMspContext;
    }

    public JSONObject processAction(Action action) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a4a858d", new Object[]{this, action});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.mMspContext == null) {
            LogUtil.e("MspLogicClient", "processAction", "mMspContext is null");
            jSONObject.put("success", (Object) Boolean.TRUE);
            return jSONObject;
        } else if (action == null) {
            jSONObject.put("result", (Object) Boolean.FALSE);
            LogUtil.e("MspLogicClient", "processAction", "action is null");
            return jSONObject;
        } else {
            LogUtil.i("MspLogicClient", "processAction.request", action.toString());
            MspUIClient mspUIClient = this.mMspContext.getMspUIClient();
            String str = null;
            switch (action.getType()) {
                case UI_START:
                    if (action instanceof UIAction) {
                        MspContext mspContext = this.mMspContext;
                        if (mspContext instanceof MspTradeContext) {
                            jSONObject = mspUIClient.handleUiStartWithoutData((UIAction) action, (MspTradeContext) mspContext);
                            break;
                        } else if (mspContext instanceof MspContainerContext) {
                            jSONObject = mspUIClient.handleUiStartWithoutData((UIAction) action, (MspContainerContext) mspContext);
                            break;
                        }
                    } else {
                        throw new Exception("action type not match!");
                    }
                    break;
                case UI_SHOW:
                    if (action instanceof UIAction) {
                        jSONObject = mspUIClient.handleUiShow((UIAction) action);
                        break;
                    } else {
                        throw new Exception("action type not match!");
                    }
                case COMMAND:
                    if (action instanceof EventAction) {
                        MspContext mspContext2 = this.mMspContext;
                        if (mspContext2 != null && mspContext2.getStoreCenter() != null) {
                            str = this.mMspContext.getStoreCenter().handleAction((EventAction) action);
                        }
                        if (str != null) {
                            jSONObject.put("result", (Object) str);
                            jSONObject.put("success", (Object) Boolean.TRUE);
                            break;
                        } else {
                            jSONObject.put("success", (Object) Boolean.FALSE);
                            break;
                        }
                    } else {
                        throw new Exception("action type not match!");
                    }
                    break;
                case NET_RETRY:
                case NET_REQUEST:
                    if (action instanceof NetAction) {
                        MspContext mspContext3 = this.mMspContext;
                        if (mspContext3 instanceof MspTradeContext) {
                            jSONObject.put("success", (Object) Boolean.valueOf(((MspTradeContext) mspContext3).getMspNetworkClient().handleAction((NetAction) action)));
                            break;
                        }
                    }
                    throw new Exception("action type not match!");
                case NET_RESPONSE:
                    break;
                case EXIT:
                    MspContext mspContext4 = this.mMspContext;
                    if (mspContext4 != null) {
                        mspContext4.exit(0);
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        break;
                    } else {
                        jSONObject.put("success", (Object) Boolean.FALSE);
                        break;
                    }
                case EXCEPTION:
                    if (action instanceof UIAction) {
                        Throwable th = (Throwable) ((UIAction) action).getData().get(UIAction.DataKeys.exception, null);
                        MspBasePresenter mspBasePresenter = this.mMspContext.getMspBasePresenter();
                        if (mspBasePresenter != null) {
                            mspBasePresenter.onException(th);
                        } else {
                            this.mMspContext.setThrowableWhenNoPresenter(th);
                        }
                        jSONObject.put("success", (Object) Boolean.TRUE);
                        break;
                    } else {
                        throw new Exception("action type not match!");
                    }
                default:
                    jSONObject.put("success", (Object) Boolean.FALSE);
                    break;
            }
            LogUtil.i("MspLogicClient", "processAction.result", action.hashCode() + " " + action.getType().toString() + " " + jSONObject.toJSONString());
            return jSONObject;
        }
    }

    @Override // com.alipay.android.msp.drivers.dipatchers.Call.Factory
    public Call newCall(Action action) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Call) ipChange.ipc$dispatch("b52b7b87", new Object[]{this, action}) : RealCall.newRealCall(this, action);
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            if (this.f4505a != null) {
                this.f4505a.onExit();
                LogUtil.i("MspLogicClient", "onExit", "ctx=" + this.mMspContext + ", this=" + this);
                this.f4505a = null;
            }
        }
    }
}
