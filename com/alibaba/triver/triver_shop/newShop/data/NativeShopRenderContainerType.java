package com.alibaba.triver.triver_shop.newShop.data;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public enum NativeShopRenderContainerType {
    TYPE_WEEX,
    TYPE_H5,
    TYPE_MINI_APP,
    TYPE_SUBSCRIBE,
    TYPE_WIDGET,
    TYPE_ALL_ITEMS,
    TYPE_LIVE,
    TYPE_WEEX_V2_WIDGET,
    TYPE_WEEX_V2,
    TYPE_UNKNOWN;
    
    public static final a Companion = new a(null);

    @JvmStatic
    public static final NativeShopRenderContainerType isWhichType(String str, String str2) {
        return Companion.a(str, str2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1291590692);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        @JvmStatic
        public final NativeShopRenderContainerType a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NativeShopRenderContainerType) ipChange.ipc$dispatch("c06ca819", new Object[]{this, str, str2});
            }
            if (str == null) {
                return NativeShopRenderContainerType.TYPE_UNKNOWN;
            }
            if (q.a((Object) "nativeAllItemContainer", (Object) str)) {
                return NativeShopRenderContainerType.TYPE_ALL_ITEMS;
            }
            if (q.a((Object) "shopWidgetContainer", (Object) str)) {
                return NativeShopRenderContainerType.TYPE_WIDGET;
            }
            if (q.a((Object) "weexExtContainer", (Object) str)) {
                if (str2 != null && n.b((CharSequence) str2, (CharSequence) "wh_weex=true", false, 2, (Object) null)) {
                    return NativeShopRenderContainerType.TYPE_WEEX;
                }
                return NativeShopRenderContainerType.TYPE_H5;
            } else if (q.a((Object) "miniappContainer", (Object) str)) {
                return NativeShopRenderContainerType.TYPE_MINI_APP;
            } else {
                if (q.a((Object) "dongtai", (Object) str)) {
                    return NativeShopRenderContainerType.TYPE_SUBSCRIBE;
                }
                if (q.a((Object) "nativeLiveContainer", (Object) str)) {
                    return NativeShopRenderContainerType.TYPE_LIVE;
                }
                if (q.a((Object) "widgetGroupContainer", (Object) str)) {
                    return NativeShopRenderContainerType.TYPE_WEEX_V2_WIDGET;
                }
                if (q.a((Object) "weexV2Container", (Object) str)) {
                    return NativeShopRenderContainerType.TYPE_WEEX_V2;
                }
                return NativeShopRenderContainerType.TYPE_UNKNOWN;
            }
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : q.a((Object) "miniappContainer", (Object) str);
        }

        public final String a(NativeShopRenderContainerType containerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ebad463b", new Object[]{this, containerType});
            }
            q.d(containerType, "containerType");
            return containerType == NativeShopRenderContainerType.TYPE_WEEX ? "weex" : containerType == NativeShopRenderContainerType.TYPE_H5 ? "h5" : containerType == NativeShopRenderContainerType.TYPE_MINI_APP ? "miniapp" : containerType == NativeShopRenderContainerType.TYPE_SUBSCRIBE ? "subscribe" : containerType == NativeShopRenderContainerType.TYPE_WIDGET ? "widgetContainer" : "unknown";
        }
    }
}
