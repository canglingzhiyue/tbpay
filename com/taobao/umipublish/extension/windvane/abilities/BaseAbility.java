package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class BaseAbility implements IAbility, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public Listener mListener;
    private boolean mCanCallback = true;
    public final int MAX_PROGRESS = 100;

    /* loaded from: classes9.dex */
    public interface Listener {
        void a(int i);

        void a(JSONObject jSONObject);

        void a(String str, String str2);
    }

    /* loaded from: classes9.dex */
    public static class SimpleListener implements Listener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1772639183);
            kge.a(-336987459);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }
    }

    static {
        kge.a(1840597147);
        kge.a(1028243835);
        kge.a(1950716991);
    }

    public abstract void onExecute(JSONObject jSONObject);

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public final void execute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a0a0f4", new Object[]{this, jSONObject});
            return;
        }
        try {
            onExecute(jSONObject);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    public void setListener(Listener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2449cac7", new Object[]{this, listener});
        } else {
            this.mListener = listener;
        }
    }

    public void errorCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e05f88", new Object[]{this, str, str2});
        } else if (!this.mCanCallback) {
        } else {
            Listener listener = this.mListener;
            if (listener != null) {
                listener.a(str, str2);
            }
            this.mCanCallback = false;
            u.d("BaseAbility", "errCode=" + str + ", errMsg=" + str2);
        }
    }

    public void successCallback(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd6d2e1", new Object[]{this, jSONObject});
        } else if (!this.mCanCallback) {
        } else {
            Listener listener = this.mListener;
            if (listener != null) {
                listener.a(100);
                this.mListener.a(jSONObject);
            }
            this.mCanCallback = false;
        }
    }

    public void progressCallback(int i) {
        Listener listener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc3e10a", new Object[]{this, new Integer(i)});
        } else if (!this.mCanCallback || (listener = this.mListener) == null) {
        } else {
            listener.a(i);
        }
    }
}
