package com.taobao.message.launcher.init;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import java.security.InvalidParameterException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J4\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0006H\u0007R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/taobao/message/launcher/init/FeatureInitHelper;", "", "()V", "statusMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "getStatusMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "setStatusMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "directInit", "", "onSuccess", "Lkotlin/Function0;", "getInitSwitch", "init", "source", "clazzName", "onFailure", "isInit", "userId", "setStatus", "status", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class FeatureInitHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FeatureInitHelper INSTANCE;
    private static ConcurrentHashMap<String, Boolean> statusMap;

    @JvmStatic
    public static final boolean getInitSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10667be5", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1535492919);
        INSTANCE = new FeatureInitHelper();
        statusMap = new ConcurrentHashMap<>();
    }

    private FeatureInitHelper() {
    }

    public final ConcurrentHashMap<String, Boolean> getStatusMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("b2f373ab", new Object[]{this}) : statusMap;
    }

    public final void setStatusMap(ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c44f1f", new Object[]{this, concurrentHashMap});
            return;
        }
        q.c(concurrentHashMap, "<set-?>");
        statusMap = concurrentHashMap;
    }

    @JvmStatic
    public static final void init(String source, String clazzName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b2572b", new Object[]{source, clazzName});
            return;
        }
        q.c(source, "source");
        q.c(clazzName, "clazzName");
        TLog.loge(BundleSplitUtil.TAG, "MSG_Feature_Init");
        if (TextUtils.isEmpty(clazzName)) {
            throw new InvalidParameterException("invalid init class name");
        }
        ReInitHelper.sInitClassName = clazzName;
        BundleSplitUtil.checkMsgBundleReady$default(BundleSplitUtil.INSTANCE, source, 0, FeatureInitHelper$init$1.INSTANCE, FeatureInitHelper$init$2.INSTANCE, false, null, 48, null);
    }

    @JvmStatic
    public static final void init(String source, String clazzName, ruk<t> onSuccess, ruk<t> onFailure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb3befb", new Object[]{source, clazzName, onSuccess, onFailure});
            return;
        }
        q.c(source, "source");
        q.c(clazzName, "clazzName");
        q.c(onSuccess, "onSuccess");
        q.c(onFailure, "onFailure");
        if (TextUtils.isEmpty(clazzName)) {
            throw new InvalidParameterException("invalid init class name");
        }
        ReInitHelper.sInitClassName = clazzName;
        BundleSplitUtil.checkMsgBundleReady$default(BundleSplitUtil.INSTANCE, source, 0, new FeatureInitHelper$init$3(onSuccess), new FeatureInitHelper$init$4(onFailure), false, null, 48, null);
    }

    @JvmStatic
    public static final void directInit(ruk<t> onSuccess) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f78b88", new Object[]{onSuccess});
            return;
        }
        q.c(onSuccess, "onSuccess");
        TLog.loge(BundleSplitUtil.TAG, "MSG_Direct_Init");
        ReInitHelper.init();
        onSuccess.mo2427invoke();
    }

    @JvmStatic
    public static final boolean isInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aad89c6f", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return q.a((Object) statusMap.get(str), (Object) true);
        }
        return false;
    }

    @JvmStatic
    public static final void setStatus(String userId, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e410ef", new Object[]{userId, new Boolean(z)});
            return;
        }
        q.c(userId, "userId");
        if (TextUtils.isEmpty(userId)) {
            return;
        }
        statusMap.put(userId, Boolean.valueOf(z));
    }
}
