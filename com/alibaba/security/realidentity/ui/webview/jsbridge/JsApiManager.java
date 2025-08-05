package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alibaba.security.realidentity.a;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.c4;
import com.alibaba.security.realidentity.d;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class JsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "JsApiManager";
    public RPBizConfig mRPBizConfig;
    public final List<JSTopicInfo> mTopicInfos;
    public c4 mTrackLog;
    public u4 mVerifyBizCapacity;

    /* loaded from: classes3.dex */
    public static final class HOLDER {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final JsApiManager INSTANCE = new JsApiManager();

        public static /* synthetic */ JsApiManager access$100() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JsApiManager) ipChange.ipc$dispatch("72df17c0", new Object[0]) : INSTANCE;
        }
    }

    /* loaded from: classes3.dex */
    public class JSTopicInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Class<? extends BaseJsExecutor> executeCls;
        public String topic;

        public JSTopicInfo(String str, Class<? extends BaseJsExecutor> cls) {
            this.topic = str;
            this.executeCls = cls;
        }

        public boolean contains(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
            }
            String str2 = this.topic;
            if (str2 == null) {
                return false;
            }
            return TextUtils.equals(str, this.topic) || Arrays.asList(str2.split(",")).contains(str);
        }
    }

    private void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mTopicInfos.clear();
        }
    }

    private void collectJsBridgeExceptionLog(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a18e49", new Object[]{this, str, str2, th});
            return;
        }
        String b = d.b(th);
        c4 c4Var = this.mTrackLog;
        if (c4Var == null) {
            return;
        }
        c4Var.a(this.mRPBizConfig.getBasicsConfig().verifyToken, TrackLog.createSdkExceptionLog(str, str2, b));
    }

    public static JsApiManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JsApiManager) ipChange.ipc$dispatch("228dfb26", new Object[0]) : HOLDER.access$100();
    }

    private Class<? extends BaseJsExecutor> getTopicExec(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a738b568", new Object[]{this, str});
        }
        for (JSTopicInfo jSTopicInfo : this.mTopicInfos) {
            if (jSTopicInfo.contains(str)) {
                return jSTopicInfo.executeCls;
            }
        }
        return null;
    }

    public void collectLog(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4919566e", new Object[]{this, trackLog});
            return;
        }
        c4 c4Var = this.mTrackLog;
        if (c4Var == null) {
            return;
        }
        c4Var.a(this.mRPBizConfig.getBasicsConfig().verifyToken, trackLog);
    }

    public boolean dispatch(Context context, String str, String str2, JsCallbackAdapter jsCallbackAdapter) {
        Class<? extends BaseJsExecutor> topicExec = getTopicExec(str);
        if (topicExec != null) {
            try {
                Constructor<? extends BaseJsExecutor> declaredConstructor = topicExec.getDeclaredConstructor(u4.class);
                declaredConstructor.setAccessible(true);
                BaseJsExecutor newInstance = declaredConstructor.newInstance(this.mVerifyBizCapacity);
                if (this.mRPBizConfig == null) {
                    this.mRPBizConfig = RPBizConfig.create();
                }
                newInstance.executeRP(context, str2, this.mRPBizConfig, jsCallbackAdapter);
                return true;
            } catch (Throwable th) {
                a.a(TAG, th);
                collectJsBridgeExceptionLog(str, str2, th);
            }
        }
        return false;
    }

    public void registerJSApi(Class<? extends BaseJsExecutor>[] clsArr) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3b86dd", new Object[]{this, clsArr});
            return;
        }
        clear();
        if (clsArr == null) {
            return;
        }
        for (Class<? extends BaseJsExecutor> cls : clsArr) {
            JSTopic jSTopic = (JSTopic) cls.getAnnotation(JSTopic.class);
            if (jSTopic != null) {
                name = jSTopic.topic();
            } else {
                name = cls.getName();
            }
            this.mTopicInfos.add(new JSTopicInfo(name, cls));
        }
    }

    public void setRPBizConfig(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25272ae0", new Object[]{this, rPBizConfig});
        } else {
            this.mRPBizConfig = rPBizConfig;
        }
    }

    public void setTrackLog(c4 c4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fa5f9b", new Object[]{this, c4Var});
        } else {
            this.mTrackLog = c4Var;
        }
    }

    public void setVerifyBizCapacity(u4 u4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ce1e4", new Object[]{this, u4Var});
        } else {
            this.mVerifyBizCapacity = u4Var;
        }
    }

    public JsApiManager() {
        if (d.b()) {
            q.a("RP", (Class<? extends e>) RP.class);
        }
        this.mTopicInfos = new ArrayList();
    }
}
