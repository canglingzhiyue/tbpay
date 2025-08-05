package com.taobao.tab2interact.core.component.browser.data;

import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class BrowserBadgeModel {

    /* renamed from: a  reason: collision with root package name */
    public UserStage f19724a;
    public boolean b;
    public boolean c;
    public BrowserTaskModel d;
    public BrowserBadgeViewModel e;
    public UserType f;
    public a g;

    /* loaded from: classes8.dex */
    public static class BrowserBadgeViewModel {

        /* renamed from: a  reason: collision with root package name */
        public g f19725a;
        public e b;
        public c c;
        public l d;

        /* loaded from: classes8.dex */
        public static class PicModel {
            public Type b;
            public String c;
            public String d;
            public String e;

            /* loaded from: classes8.dex */
            public enum Type {
                PNG,
                APNG
            }

            static {
                kge.a(657579061);
            }
        }

        /* loaded from: classes8.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f19726a;
            public int b;
            public long c;
            public String d;

            static {
                kge.a(-1918609447);
            }
        }

        /* loaded from: classes8.dex */
        public static class b extends h {

            /* renamed from: a  reason: collision with root package name */
            public int f19727a;

            static {
                kge.a(-1763229335);
            }
        }

        /* loaded from: classes8.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public f f19728a;
            public PicModel b;
            public PicModel c;
            public PicModel d;

            static {
                kge.a(-1394842757);
            }
        }

        /* loaded from: classes8.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f19729a;
            public long b;

            static {
                kge.a(1910260489);
            }
        }

        /* loaded from: classes8.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public PicModel f19730a;
            public b b;
            public d c;
            public a d;
            public f e;
            public f f;
            public f g;
            public j h;

            static {
                kge.a(2043861841);
            }
        }

        /* loaded from: classes8.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public String f19731a;
            public String b;

            static {
                kge.a(137129030);
            }
        }

        /* loaded from: classes8.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public f f19732a;
            public PicModel b;

            static {
                kge.a(-1163097539);
            }
        }

        /* loaded from: classes8.dex */
        public static class h extends PicModel {
            static {
                kge.a(587158625);
            }
        }

        /* loaded from: classes8.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public long f19733a;
            public String b;
            public TaskType c;

            static {
                kge.a(-1038854290);
            }
        }

        /* loaded from: classes8.dex */
        public static class j extends k {
            public String d;

            static {
                kge.a(175257548);
            }
        }

        /* loaded from: classes8.dex */
        public static class k extends i {
            static {
                kge.a(-210108774);
            }
        }

        /* loaded from: classes8.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            public String f19734a;
            public String b;

            static {
                kge.a(-1933287521);
            }
        }

        static {
            kge.a(34276238);
        }
    }

    /* loaded from: classes8.dex */
    public static class BrowserTaskModel {

        /* renamed from: a  reason: collision with root package name */
        public long f19735a;
        public long b;
        public long c;
        public Map<ContentType, a> d;

        /* loaded from: classes8.dex */
        public enum ContentType {
            VIDEO,
            LIVE,
            PICTURE_ALBUM,
            GG_GAME,
            COLLECTION,
            EXT
        }

        /* loaded from: classes8.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public long f19736a;

            static {
                kge.a(1328740790);
            }
        }

        static {
            kge.a(-926037993);
        }
    }

    /* loaded from: classes8.dex */
    public enum TaskType {
        DEFAULT,
        BROWSE_IN_TASK_PANEL
    }

    /* loaded from: classes8.dex */
    public enum UserStage {
        DEFAULT,
        SIMPLE_FOR_NEW_USER
    }

    /* loaded from: classes8.dex */
    public enum UserType {
        DEFAULT,
        REWARD_ENHANCED
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f19737a;
        public String b;
        public C0819a c;

        /* renamed from: com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static class C0819a {

            /* renamed from: a  reason: collision with root package name */
            public b f19738a;
            public b b;

            static {
                kge.a(-157679763);
            }
        }

        /* loaded from: classes8.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f19739a;
            public String b;

            static {
                kge.a(66676903);
            }
        }

        static {
            kge.a(2146645258);
        }
    }

    static {
        kge.a(498802089);
    }
}
