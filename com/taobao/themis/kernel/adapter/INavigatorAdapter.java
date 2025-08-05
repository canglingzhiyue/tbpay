package com.taobao.themis.kernel.adapter;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public interface INavigatorAdapter extends com.taobao.themis.kernel.basic.a {
    public static final String ALLOW_ESCAPE = "allowEscape";
    public static final String CATEGORY = "category";
    public static final String CLASS_NAME = "className";
    public static final a Companion = a.f22501a;
    public static final String DISABLE_TRANSITION = "disableTransition";
    public static final String DISALLOW_LOOPBACK = "disallowLoopback";
    public static final String SKIP_ALL_PROCESSOR = "skipAllProcessor";
    public static final String SKIP_PRE_PROCESSOR = "skipPreProcessor";

    /* loaded from: classes9.dex */
    public static final class a {
        public static final String ALLOW_ESCAPE = "allowEscape";
        public static final String CATEGORY = "category";
        public static final String CLASS_NAME = "className";
        public static final String DISABLE_TRANSITION = "disableTransition";
        public static final String DISALLOW_LOOPBACK = "disallowLoopback";
        public static final String SKIP_ALL_PROCESSOR = "skipAllProcessor";
        public static final String SKIP_PRE_PROCESSOR = "skipPreProcessor";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f22501a;

        static {
            kge.a(2127265133);
            f22501a = new a();
        }

        private a() {
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-544138607);
        }

        public static /* synthetic */ boolean a(INavigatorAdapter iNavigatorAdapter, Context context, String str, Bundle bundle, Bundle bundle2, Map map, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7d1b393e", new Object[]{iNavigatorAdapter, context, str, bundle, bundle2, map, new Integer(i), obj})).booleanValue();
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openURL");
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            Bundle bundle3 = bundle;
            if ((i & 8) != 0) {
                bundle2 = null;
            }
            Bundle bundle4 = bundle2;
            Map map2 = map;
            if ((i & 16) != 0) {
                map2 = null;
            }
            return iNavigatorAdapter.openURL(context, str, bundle3, bundle4, map2);
        }
    }

    boolean openURL(Context context, String str, Bundle bundle, Bundle bundle2, Map<String, ? extends Object> map);
}
