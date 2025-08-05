package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.kge;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes4.dex */
public @interface TradeHybridStage {
    public static final a Companion = a.f8749a;
    public static final String ON_CONFIRM_SUCCESS_FLOAT_CLOSE = "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
    public static final String ON_CONTAINER_CREATE = "ON_CONTAINER_CREATE";
    public static final String ON_CONTAINER_DESTROY = "ON_CONTAINER_DESTROY";
    public static final String ON_CONTAINER_PAUSE = "ON_CONTAINER_PAUSE";
    public static final String ON_CONTAINER_RESUME = "ON_CONTAINER_RESUME";
    public static final String ON_DATA_PRE_LOAD = "ON_DATA_PRE_LOAD";
    public static final String ON_EVENT_CHAIN_AFTER = "ON_EVENT_CHAIN_AFTER";
    public static final String ON_MEMORY_WARNING = "ON_MEMORY_WARNING";
    public static final String ON_MTOP_END = "ON_MTOP_END";
    public static final String ON_MTOP_START = "ON_MTOP_START";
    public static final String ON_NAV = "ON_NAV";
    public static final String ON_RENDER_END = "ON_RENDER_END";
    public static final String ON_RENDER_START = "ON_RENDER_START";
    public static final String ON_VIEW_SCROLLING = "ON_VIEW_SCROLLING";
    public static final String ON_VIEW_SCROLL_END = "ON_VIEW_SCROLL_END";
    public static final String ON_VIEW_SCROLL_START = "ON_VIEW_SCROLL_START";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ON_CONFIRM_SUCCESS_FLOAT_CLOSE = "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
        public static final String ON_CONTAINER_CREATE = "ON_CONTAINER_CREATE";
        public static final String ON_CONTAINER_DESTROY = "ON_CONTAINER_DESTROY";
        public static final String ON_CONTAINER_PAUSE = "ON_CONTAINER_PAUSE";
        public static final String ON_CONTAINER_RESUME = "ON_CONTAINER_RESUME";
        public static final String ON_DATA_PRE_LOAD = "ON_DATA_PRE_LOAD";
        public static final String ON_EVENT_CHAIN_AFTER = "ON_EVENT_CHAIN_AFTER";
        public static final String ON_MEMORY_WARNING = "ON_MEMORY_WARNING";
        public static final String ON_MTOP_END = "ON_MTOP_END";
        public static final String ON_MTOP_START = "ON_MTOP_START";
        public static final String ON_NAV = "ON_NAV";
        public static final String ON_RENDER_END = "ON_RENDER_END";
        public static final String ON_RENDER_START = "ON_RENDER_START";
        public static final String ON_VIEW_SCROLLING = "ON_VIEW_SCROLLING";
        public static final String ON_VIEW_SCROLL_END = "ON_VIEW_SCROLL_END";
        public static final String ON_VIEW_SCROLL_START = "ON_VIEW_SCROLL_START";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8749a;

        static {
            kge.a(1227648544);
            f8749a = new a();
        }

        private a() {
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1958322525:
                    if (!str.equals("ON_NAV")) {
                        return null;
                    }
                    return "ON_NAV";
                case -1946079196:
                    if (!str.equals("ON_MTOP_END")) {
                        return null;
                    }
                    return "ON_MTOP_END";
                case -1858225813:
                    if (!str.equals("ON_MTOP_START")) {
                        return null;
                    }
                    return "ON_MTOP_START";
                case -1751682830:
                    if (!str.equals("ON_RENDER_END")) {
                        return null;
                    }
                    return "ON_RENDER_END";
                case -1746197992:
                    if (!str.equals("ON_CONTAINER_PAUSE")) {
                        return null;
                    }
                    return "ON_CONTAINER_PAUSE";
                case -1461108406:
                    if (!str.equals("ON_VIEW_SCROLL_START")) {
                        return null;
                    }
                    return "ON_VIEW_SCROLL_START";
                case -765779005:
                    if (!str.equals("ON_VIEW_SCROLL_END")) {
                        return null;
                    }
                    return "ON_VIEW_SCROLL_END";
                case -711452772:
                    if (!str.equals("ON_CONTAINER_DESTROY")) {
                        return null;
                    }
                    return "ON_CONTAINER_DESTROY";
                case -412890185:
                    if (!str.equals("ON_DATA_PRE_LOAD")) {
                        return null;
                    }
                    return "ON_DATA_PRE_LOAD";
                case -301818085:
                    if (!str.equals("ON_VIEW_SCROLLING")) {
                        return null;
                    }
                    return "ON_VIEW_SCROLLING";
                case 42599738:
                    if (!str.equals("ON_CONFIRM_SUCCESS_FLOAT_CLOSE")) {
                        return null;
                    }
                    return "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
                case 273088185:
                    if (!str.equals("ON_RENDER_START")) {
                        return null;
                    }
                    return "ON_RENDER_START";
                case 956533918:
                    if (!str.equals("ON_MEMORY_WARNING")) {
                        return null;
                    }
                    return "ON_MEMORY_WARNING";
                case 1345464570:
                    if (!str.equals("ON_CONTAINER_CREATE")) {
                        return null;
                    }
                    return "ON_CONTAINER_CREATE";
                case 1763332139:
                    if (!str.equals("ON_CONTAINER_RESUME")) {
                        return null;
                    }
                    return "ON_CONTAINER_RESUME";
                case 2021187065:
                    if (!str.equals("ON_EVENT_CHAIN_AFTER")) {
                        return null;
                    }
                    return "ON_EVENT_CHAIN_AFTER";
                default:
                    return null;
            }
        }
    }
}
