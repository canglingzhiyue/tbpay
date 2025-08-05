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
public @interface SharePannelShareTarget {
    public static final a Companion = a.f8738a;
    public static final String alipay = "alipay";
    public static final String contacts = "contacts";
    public static final String copy = "copy";
    public static final String dingtalk = "dingtalk";
    public static final String qq = "qq";
    public static final String sms = "sms";
    public static final String taopassword = "taopassword";
    public static final String tyq = "tyq";
    public static final String weibo = "weibo";
    public static final String wxfriend = "wxfriend";
    public static final String wxminiapp = "wxminiapp";
    public static final String wxtimeline = "wxtimeline";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8738a;
        public static final String alipay = "alipay";
        public static final String contacts = "contacts";
        public static final String copy = "copy";
        public static final String dingtalk = "dingtalk";
        public static final String qq = "qq";
        public static final String sms = "sms";
        public static final String taopassword = "taopassword";
        public static final String tyq = "tyq";
        public static final String weibo = "weibo";
        public static final String wxfriend = "wxfriend";
        public static final String wxminiapp = "wxminiapp";
        public static final String wxtimeline = "wxtimeline";

        static {
            kge.a(944391099);
            f8738a = new a();
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
                case -1838124510:
                    if (!str.equals("wxtimeline")) {
                        return null;
                    }
                    return "wxtimeline";
                case -1716864963:
                    if (!str.equals("taopassword")) {
                        return null;
                    }
                    return "taopassword";
                case -1414960566:
                    if (!str.equals("alipay")) {
                        return null;
                    }
                    return "alipay";
                case -904024897:
                    if (!str.equals("wxfriend")) {
                        return null;
                    }
                    return "wxfriend";
                case -590347159:
                    if (!str.equals("wxminiapp")) {
                        return null;
                    }
                    return "wxminiapp";
                case -567451565:
                    if (!str.equals("contacts")) {
                        return null;
                    }
                    return "contacts";
                case 3616:
                    if (!str.equals("qq")) {
                        return null;
                    }
                    return "qq";
                case 114009:
                    if (!str.equals("sms")) {
                        return null;
                    }
                    return "sms";
                case 115340:
                    if (!str.equals("tyq")) {
                        return null;
                    }
                    return "tyq";
                case 3059573:
                    if (!str.equals("copy")) {
                        return null;
                    }
                    return "copy";
                case 113011944:
                    if (!str.equals("weibo")) {
                        return null;
                    }
                    return "weibo";
                case 133862058:
                    if (!str.equals("dingtalk")) {
                        return null;
                    }
                    return "dingtalk";
                default:
                    return null;
            }
        }
    }
}
