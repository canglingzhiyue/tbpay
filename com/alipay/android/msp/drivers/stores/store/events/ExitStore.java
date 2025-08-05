package com.alipay.android.msp.drivers.stores.store.events;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean g;

    public static /* synthetic */ Object ipc$super(ExitStore exitStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ MspTradeContext a(ExitStore exitStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("8101a54f", new Object[]{exitStore}) : exitStore.b;
    }

    public ExitStore(int i) {
        super(i);
        this.g = false;
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (a(eventAction, mspEvent)) {
            return "";
        }
        int logFieldEndCode = eventAction.getLogFieldEndCode();
        if (logFieldEndCode != 0 && this.f4584a != null) {
            this.f4584a.getStatisticInfo().updateAttr(Vector.Result, "clientEndCode", String.valueOf(logFieldEndCode));
        }
        if (this.f4584a != null) {
            this.f4584a.exit(0);
        }
        return String.valueOf(logFieldEndCode);
    }

    private boolean a(final EventAction eventAction, final EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        final MspPayResult mspPayResult;
        boolean booleanValue;
        final MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f6f19d6", new Object[]{this, eventAction, mspEvent})).booleanValue();
        }
        if (this.g) {
            return false;
        }
        this.g = true;
        if (this.f4584a == null || this.d == null || (mspUIClient = this.f4584a.getMspUIClient()) == null || this.b == null || (mspPayResult = this.b.getMspPayResult()) == null) {
            return false;
        }
        JSONObject extendInfo = mspPayResult.getExtendInfo();
        if (extendInfo.containsKey(MspFlybirdDefine.THIRDPROMPT)) {
            try {
                booleanValue = extendInfo.getBooleanValue(MspFlybirdDefine.THIRDPROMPT);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            currentPresenter = mspUIClient.getCurrentPresenter();
            if (currentPresenter == null && booleanValue && mspPayResult.isSuccess() && this.b.isFromThirdDomainJsApi() && currentPresenter.mo545getIView() != null && currentPresenter.getActivity() != null) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (currentPresenter.mo545getIView() == null || currentPresenter.getActivity() == null) {
                        } else {
                            ThirdH5PageExitDialog thirdH5PageExitDialog = new ThirdH5PageExitDialog(currentPresenter.getActivity(), ExitStore.a(ExitStore.this).getDomain());
                            thirdH5PageExitDialog.show();
                            thirdH5PageExitDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnKeyListener
                                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ((Boolean) ipChange3.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                                    }
                                    if (i != 4) {
                                        return false;
                                    }
                                    PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                                    mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                                    ExitStore.this.onstMspAction(eventAction, mspEvent);
                                    return true;
                                }
                            });
                            thirdH5PageExitDialog.setLeftOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                                    mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                                    ExitStore.this.onstMspAction(eventAction, mspEvent);
                                }
                            });
                            thirdH5PageExitDialog.setRightOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    } else {
                                        ExitStore.this.onstMspAction(eventAction, mspEvent);
                                    }
                                }
                            });
                        }
                    }
                });
                return true;
            }
            return false;
        }
        booleanValue = false;
        currentPresenter = mspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return false;
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (currentPresenter.mo545getIView() == null || currentPresenter.getActivity() == null) {
                } else {
                    ThirdH5PageExitDialog thirdH5PageExitDialog = new ThirdH5PageExitDialog(currentPresenter.getActivity(), ExitStore.a(ExitStore.this).getDomain());
                    thirdH5PageExitDialog.show();
                    thirdH5PageExitDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnKeyListener
                        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                            }
                            if (i != 4) {
                                return false;
                            }
                            PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                            mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                            ExitStore.this.onstMspAction(eventAction, mspEvent);
                            return true;
                        }
                    });
                    thirdH5PageExitDialog.setLeftOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            PhoneCashierMspEngine.getMspJump().processScheme(GlobalConstant.SCHEME_TO_WALLET_HOME);
                            mspPayResult.addExtendInfoByKeyAndValue(MspGlobalDefine.EXITMODE, MspGlobalDefine.NOCALLBACK);
                            ExitStore.this.onstMspAction(eventAction, mspEvent);
                        }
                    });
                    thirdH5PageExitDialog.setRightOnClickListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.ExitStore.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                ExitStore.this.onstMspAction(eventAction, mspEvent);
                            }
                        }
                    });
                }
            }
        });
        return true;
    }
}
