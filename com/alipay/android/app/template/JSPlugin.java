package com.alipay.android.app.template;

import android.content.Context;
import com.alipay.android.app.template.FBContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import tb.cun;

/* loaded from: classes3.dex */
public abstract class JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_CONEXT_HASHCODE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final FBContext.JsExecOptions f4449a = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
    public Context mContext;

    /* loaded from: classes3.dex */
    public enum FromCall {
        GET_PROP,
        SET_PROP,
        INVOKE
    }

    /* loaded from: classes3.dex */
    public interface ISession {
    }

    @Deprecated
    public static void safeSendNativeResult(FBDocument fBDocument, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72dcc97", new Object[]{fBDocument, new Long(j), str});
        } else {
            safeSendNativeResult(fBDocument, j, str, f4449a);
        }
    }

    @Deprecated
    public static void sendNativeResult(FBDocument fBDocument, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea0d1e4", new Object[]{fBDocument, new Long(j), str});
        } else if (fBDocument == null || fBDocument.mCore == 0) {
        } else {
            try {
                FBDocument.nativeCallJsMethodWithJson(fBDocument.mCore, j, str);
            } catch (Throwable th) {
                cun.a("JSPlugin", "error", th);
            }
        }
    }

    public Object execute(FromCall fromCall, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4807a199", new Object[]{this, fromCall, str, str2});
        }
        return null;
    }

    public Object execute(FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context, ISession iSession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("86eddeda", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context, iSession}) : execute(fromCall, str, str2);
    }

    public Object execute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c4966fac", new Object[]{this, str}) : "";
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    public int getContextHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        Context context = this.mContext;
        if (context != null) {
            return context.hashCode();
        }
        return 0;
    }

    public String pluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a669a95b", new Object[]{this}) : "";
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public static void safeSendNativeResult(FBDocument fBDocument, long j, String str, FBContext.JsExecOptions jsExecOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56551c7", new Object[]{fBDocument, new Long(j), str, jsExecOptions});
            return;
        }
        if (jsExecOptions == null) {
            cun.a("missing call opt");
        }
        if (fBDocument == null || fBDocument.mCore == 0) {
            return;
        }
        try {
            FBDocument.a(fBDocument, j, str, jsExecOptions);
        } catch (Throwable th) {
            cun.a("JSPlugin", "error safeSend", th);
        }
    }

    public Object execute(FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context}) : execute(fromCall, str, str2, fBDocument, j, context, null);
    }
}
