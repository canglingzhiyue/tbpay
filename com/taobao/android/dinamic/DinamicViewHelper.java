package com.taobao.android.dinamic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DCheckBoxConstructor;
import com.taobao.android.dinamic.constructor.DCountDownTimerConstructor;
import com.taobao.android.dinamic.constructor.DFrameLayoutConstructor;
import com.taobao.android.dinamic.constructor.DHorizontalScrollLayoutConstructor;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;
import com.taobao.android.dinamic.constructor.DLinearLayoutConstructor;
import com.taobao.android.dinamic.constructor.DLoopLinearLayoutConstructor;
import com.taobao.android.dinamic.constructor.DSwitchConstructor;
import com.taobao.android.dinamic.constructor.DTextInputConstructor;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.dinamic.exception.DinamicException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class DinamicViewHelper implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, a> eventHandlers;
    private static Map<String, com.taobao.android.dinamic.dinamic.h> viewConstructors;

    static {
        kge.a(1200374543);
        kge.a(1028243835);
        viewConstructors = new HashMap();
        eventHandlers = new HashMap();
        viewConstructors.put("DView", new com.taobao.android.dinamic.dinamic.h());
        viewConstructors.put("DTextView", new DTextViewConstructor());
        viewConstructors.put("DImageView", new DImageViewConstructor());
        viewConstructors.put("DFrameLayout", new DFrameLayoutConstructor());
        viewConstructors.put("DLinearLayout", new DLinearLayoutConstructor());
        viewConstructors.put("DHorizontalScrollLayout", new DHorizontalScrollLayoutConstructor());
        viewConstructors.put("DCountDownTimerView", new DCountDownTimerConstructor());
        viewConstructors.put("DLoopLinearLayout", new DLoopLinearLayoutConstructor());
        viewConstructors.put("DTextInput", new DTextInputConstructor());
        viewConstructors.put("DCheckBox", new DCheckBoxConstructor());
        viewConstructors.put("DSwitch", new DSwitchConstructor());
    }

    public static void registerViewConstructor(String str, com.taobao.android.dinamic.dinamic.h hVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed18789d", new Object[]{str, hVar});
        } else if (TextUtils.isEmpty(str) || hVar == null) {
            throw new DinamicException("viewIdentify or assistant is null");
        } else {
            if (viewConstructors.get(str) != null) {
                throw new DinamicException("assistant already registed by current identify:" + str);
            }
            viewConstructors.put(str, hVar);
        }
    }

    public static void registerReplaceViewConstructor(String str, com.taobao.android.dinamic.dinamic.h hVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245287ef", new Object[]{str, hVar});
        } else if (TextUtils.isEmpty(str) || hVar == null) {
            throw new DinamicException("viewIdentify or assistant is null");
        } else {
            viewConstructors.put(str, hVar);
        }
    }

    public static void registerEventHandler(String str, a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c867125", new Object[]{str, aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null) {
            throw new DinamicException("registerEventHandler failed, eventIdentify or handler is null");
        } else {
            if (eventHandlers.get(str) != null) {
                throw new DinamicException("registerEventHandler failed, eventHander already register by current identify:" + str);
            }
            eventHandlers.put(str, aVar);
        }
    }

    public static void registerReplaceEventHandler(String str, a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09cf313", new Object[]{str, aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null) {
            throw new DinamicException("registerEventHandler failed, eventIdentify or handler is null");
        } else {
            eventHandlers.put(str, aVar);
        }
    }

    public static com.taobao.android.dinamic.dinamic.h getViewConstructor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.h) ipChange.ipc$dispatch("36122500", new Object[]{str}) : viewConstructors.get(str);
    }

    public static com.taobao.android.dinamic.dinamic.d getEventHandler(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.dinamic.d) ipChange.ipc$dispatch("3bd4e83d", new Object[]{str}) : eventHandlers.get(str);
    }
}
