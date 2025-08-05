package com.alipay.android.app.safepaybase.alikeyboard;

import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class KeyboardManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, AlipayKeyboard> f4389a = new ConcurrentHashMap();

    public static void bindKeyboard(int i, AlipayKeyboard alipayKeyboard) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f505a886", new Object[]{new Integer(i), alipayKeyboard});
        } else if (alipayKeyboard == null) {
        } else {
            LogUtils.record(2, "KeyboardManager::bindKeyboard", "KeyboardManager-bindKeyboard:" + i);
            f4389a.put(Integer.valueOf(i), alipayKeyboard);
        }
    }

    public static void unBindKeyboard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8b10ff", new Object[]{new Integer(i)});
            return;
        }
        LogUtils.record(2, "KeyboardManager::unBindKeyboard", "KeyboardManager-unBindKeyboard:" + i);
        if (!f4389a.containsKey(Integer.valueOf(i))) {
            return;
        }
        f4389a.remove(Integer.valueOf(i));
    }

    public static AlipayKeyboard getKeyboard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayKeyboard) ipChange.ipc$dispatch("f757f4ed", new Object[]{new Integer(i)});
        }
        LogUtils.record(2, "KeyboardManager::getKeyboard", "KeyboardManager-getKeyboard:" + i);
        if (!f4389a.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return f4389a.get(Integer.valueOf(i));
    }

    public static boolean isBindKeyboard(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f67e692", new Object[]{new Integer(i)})).booleanValue() : getKeyboard(i) != null;
    }
}
