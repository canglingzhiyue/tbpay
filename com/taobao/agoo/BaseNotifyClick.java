package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.m;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.taobao.search.common.util.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public abstract class BaseNotifyClick {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "accs.BaseNotifyClick";
    private AgooFactory agooFactory;
    private Context mContext;
    private List<MsgDO> mMsgDOList;
    private String msgSource;
    private NotifManager notifyManager;

    static {
        kge.a(1859932984);
    }

    public abstract void onMessage(Intent intent);

    public static /* synthetic */ String access$000(BaseNotifyClick baseNotifyClick, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("903e79d1", new Object[]{baseNotifyClick, intent}) : baseNotifyClick.parseMsgByThirdPush(intent);
    }

    public static /* synthetic */ String access$100(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef02c2ef", new Object[]{baseNotifyClick}) : baseNotifyClick.msgSource;
    }

    public static /* synthetic */ NotifManager access$200(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotifManager) ipChange.ipc$dispatch("7c517c34", new Object[]{baseNotifyClick}) : baseNotifyClick.notifyManager;
    }

    public static /* synthetic */ NotifManager access$202(BaseNotifyClick baseNotifyClick, NotifManager notifManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifManager) ipChange.ipc$dispatch("14b1176a", new Object[]{baseNotifyClick, notifManager});
        }
        baseNotifyClick.notifyManager = notifManager;
        return notifManager;
    }

    public static /* synthetic */ AgooFactory access$300(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AgooFactory) ipChange.ipc$dispatch("d76d5422", new Object[]{baseNotifyClick}) : baseNotifyClick.agooFactory;
    }

    public static /* synthetic */ AgooFactory access$302(BaseNotifyClick baseNotifyClick, AgooFactory agooFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AgooFactory) ipChange.ipc$dispatch("b2027989", new Object[]{baseNotifyClick, agooFactory});
        }
        baseNotifyClick.agooFactory = agooFactory;
        return agooFactory;
    }

    public static /* synthetic */ Context access$400(BaseNotifyClick baseNotifyClick) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("64ffb566", new Object[]{baseNotifyClick}) : baseNotifyClick.mContext;
    }

    public static /* synthetic */ void access$500(BaseNotifyClick baseNotifyClick, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cfe20a", new Object[]{baseNotifyClick, intent});
        } else {
            baseNotifyClick.reportClickNotifyMsg(intent);
        }
    }

    public void onCreate(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5363903", new Object[]{this, context, intent});
            return;
        }
        ALog.i(TAG, i.b.MEASURE_ONCREATE, new Object[0]);
        this.mContext = context;
        if (m.g()) {
            buildMessageV2(intent);
        } else {
            buildMessage(intent);
        }
    }

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ALog.i(TAG, "onNewIntent", new Object[0]);
        if (m.g()) {
            buildMessageV2(intent);
        } else {
            buildMessage(intent);
        }
    }

    private Intent handleIntent(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b9675339", new Object[]{this, context, intent, new Boolean(z)});
        }
        Intent intent2 = null;
        if (intent == null) {
            return null;
        }
        try {
            String parseMsgByThirdPush = parseMsgByThirdPush(intent);
            if (StringUtils.isEmpty(parseMsgByThirdPush) || StringUtils.isEmpty(this.msgSource)) {
                ALog.e(TAG, "parseMsgFromNotifyListener null!!", "source", this.msgSource);
                return null;
            }
            if (this.notifyManager == null) {
                this.notifyManager = new NotifManager();
            }
            if (this.agooFactory == null) {
                this.agooFactory = new AgooFactory();
                this.agooFactory.init(context, this.notifyManager, null);
            }
            if (z && this.mMsgDOList == null) {
                this.mMsgDOList = new ArrayList();
            }
            Bundle msgReceiverPreHandler = this.agooFactory.msgReceiverPreHandler(parseMsgByThirdPush.getBytes("UTF-8"), this.msgSource, null, false, this.mMsgDOList);
            if (StringUtils.equals(msgReceiverPreHandler.getString(AgooConstants.MESSAGE_ENCRYPTED), "4")) {
                String string = msgReceiverPreHandler.getString(AgooConstants.MESSAGE_BODY);
                ALog.e(TAG, "begin parse EncryptedMsg", new Object[0]);
                String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                if (!StringUtils.isEmpty(parseEncryptedMsg)) {
                    msgReceiverPreHandler.putString(AgooConstants.MESSAGE_BODY, parseEncryptedMsg);
                } else {
                    ALog.e(TAG, "parse EncryptedMsg fail, empty", new Object[0]);
                }
            }
            Intent intent3 = new Intent();
            try {
                intent3.putExtras(msgReceiverPreHandler);
                this.agooFactory.saveMsg(parseMsgByThirdPush.getBytes("UTF-8"), "2");
                return intent3;
            } catch (Throwable th) {
                th = th;
                intent2 = intent3;
                ALog.e(TAG, "handleIntent err", th, new Object[0]);
                return intent2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void buildMessage(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4688a17d", new Object[]{this, intent});
        } else {
            a.a(new Runnable() { // from class: com.taobao.agoo.BaseNotifyClick.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Intent intent2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent3 = null;
                    try {
                        try {
                            if (intent != null) {
                                String access$000 = BaseNotifyClick.access$000(BaseNotifyClick.this, intent);
                                if (!StringUtils.isEmpty(access$000) && !StringUtils.isEmpty(BaseNotifyClick.access$100(BaseNotifyClick.this))) {
                                    if (BaseNotifyClick.access$200(BaseNotifyClick.this) == null) {
                                        BaseNotifyClick.access$202(BaseNotifyClick.this, new NotifManager());
                                    }
                                    if (BaseNotifyClick.access$300(BaseNotifyClick.this) == null) {
                                        BaseNotifyClick.access$302(BaseNotifyClick.this, new AgooFactory());
                                        BaseNotifyClick.access$300(BaseNotifyClick.this).init(BaseNotifyClick.access$400(BaseNotifyClick.this), BaseNotifyClick.access$200(BaseNotifyClick.this), null);
                                    }
                                    Bundle msgReceiverPreHandler = BaseNotifyClick.access$300(BaseNotifyClick.this).msgReceiverPreHandler(access$000.getBytes("UTF-8"), BaseNotifyClick.access$100(BaseNotifyClick.this), null, false);
                                    String string = msgReceiverPreHandler.getString(AgooConstants.MESSAGE_BODY);
                                    ALog.i(BaseNotifyClick.TAG, "begin parse EncryptedMsg", new Object[0]);
                                    String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                                    if (!StringUtils.isEmpty(parseEncryptedMsg)) {
                                        msgReceiverPreHandler.putString(AgooConstants.MESSAGE_BODY, parseEncryptedMsg);
                                    } else {
                                        ALog.e(BaseNotifyClick.TAG, "parse EncryptedMsg fail, empty", new Object[0]);
                                    }
                                    intent2 = new Intent();
                                    try {
                                        intent2.putExtras(msgReceiverPreHandler);
                                        BaseNotifyClick.access$300(BaseNotifyClick.this).saveMsg(access$000.getBytes("UTF-8"), "2");
                                        BaseNotifyClick.access$500(BaseNotifyClick.this, intent2);
                                        BaseNotifyClick.this.onMessage(intent2);
                                        return;
                                    } catch (Throwable th) {
                                        intent3 = intent2;
                                        th = th;
                                        try {
                                            ALog.e(BaseNotifyClick.TAG, "buildMessage", th, new Object[0]);
                                            try {
                                                BaseNotifyClick.this.onMessage(intent3);
                                                return;
                                            } catch (Throwable th2) {
                                                ALog.e(BaseNotifyClick.TAG, b.c.EVENT_ON_MESSAGE, th2, new Object[0]);
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                BaseNotifyClick.this.onMessage(intent3);
                                            } catch (Throwable th4) {
                                                ALog.e(BaseNotifyClick.TAG, b.c.EVENT_ON_MESSAGE, th4, new Object[0]);
                                            }
                                            throw th3;
                                        }
                                    }
                                }
                                ALog.e(BaseNotifyClick.TAG, "parseMsgFromNotifyListener null!!", "source", BaseNotifyClick.access$100(BaseNotifyClick.this));
                            }
                            BaseNotifyClick.this.onMessage(intent2);
                            return;
                        } catch (Throwable th5) {
                            ALog.e(BaseNotifyClick.TAG, b.c.EVENT_ON_MESSAGE, th5, new Object[0]);
                            return;
                        }
                        intent2 = null;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            });
        }
    }

    private void buildMessageV2(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f3fd9", new Object[]{this, intent});
        } else {
            a.a(new Runnable() { // from class: com.taobao.agoo.-$$Lambda$BaseNotifyClick$Hqw8QG-3MoEb3Pj3zOoqI9nxddg
                {
                    BaseNotifyClick.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseNotifyClick.this.lambda$buildMessageV2$1$BaseNotifyClick(intent);
                }
            });
        }
    }

    public /* synthetic */ void lambda$buildMessageV2$1$BaseNotifyClick(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e4b63", new Object[]{this, intent});
            return;
        }
        Intent handleIntent = handleIntent(this.mContext, intent, false);
        if (handleIntent != null) {
            reportClickNotifyMsg(handleIntent);
        }
        try {
            onMessage(handleIntent);
        } catch (Throwable th) {
            ALog.e(TAG, b.c.EVENT_ON_MESSAGE, th, new Object[0]);
        }
    }

    private String parseMsgByThirdPush(Intent intent) {
        DefaultMeizuMsgParseImpl defaultMeizuMsgParseImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ded4980", new Object[]{this, intent});
        }
        String str = null;
        if (BaseNotifyClickActivity.notifyListeners != null && BaseNotifyClickActivity.notifyListeners.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it = BaseNotifyClickActivity.notifyListeners.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it.next();
                String parseMsgFromIntent = next.parseMsgFromIntent(intent);
                if (!StringUtils.isEmpty(parseMsgFromIntent)) {
                    this.msgSource = next.getMsgSource();
                    str = parseMsgFromIntent;
                    break;
                }
                str = parseMsgFromIntent;
            }
        } else {
            ALog.e(TAG, "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener defaultHuaweiMsgParseImpl = new DefaultHuaweiMsgParseImpl();
            String parseMsgFromIntent2 = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            if (StringUtils.isEmpty(parseMsgFromIntent2)) {
                defaultHuaweiMsgParseImpl = new DefaultXiaomiMsgParseImpl();
                parseMsgFromIntent2 = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (StringUtils.isEmpty(parseMsgFromIntent2)) {
                defaultHuaweiMsgParseImpl = new DefaultHonorMsgParseImpl();
                parseMsgFromIntent2 = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (StringUtils.isEmpty(parseMsgFromIntent2)) {
                defaultHuaweiMsgParseImpl = new DefaultOppoMsgParseImpl();
                parseMsgFromIntent2 = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (StringUtils.isEmpty(parseMsgFromIntent2)) {
                defaultHuaweiMsgParseImpl = new DefaultVivoMsgParseImpl();
                parseMsgFromIntent2 = defaultHuaweiMsgParseImpl.parseMsgFromIntent(intent);
            }
            if (StringUtils.isEmpty(parseMsgFromIntent2)) {
                DefaultMeizuMsgParseImpl defaultMeizuMsgParseImpl2 = new DefaultMeizuMsgParseImpl();
                str = defaultMeizuMsgParseImpl2.parseMsgFromIntent(intent);
                defaultMeizuMsgParseImpl = defaultMeizuMsgParseImpl2;
            } else {
                defaultMeizuMsgParseImpl = defaultHuaweiMsgParseImpl;
                str = parseMsgFromIntent2;
            }
            if (StringUtils.isEmpty(str)) {
                d.a("accs", "error", "parse 3push error", mto.a.GEO_NOT_SUPPORT);
            } else {
                this.msgSource = defaultMeizuMsgParseImpl.getMsgSource();
                d.a("accs", "error", "parse 3push default " + this.msgSource, mto.a.GEO_NOT_SUPPORT);
            }
        }
        ALog.i(TAG, "parseMsgByThirdPush", "result", str, "msgSource", this.msgSource);
        return str;
    }

    private void reportClickNotifyMsg(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569fba68", new Object[]{this, intent});
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra3 = intent.getStringExtra("report");
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = "8";
            ALog.i(TAG, "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            this.notifyManager.report(msgDO, null);
        } catch (Throwable th) {
            ALog.e(TAG, "reportClickNotifyMsg exception", th, new Object[0]);
        }
    }
}
