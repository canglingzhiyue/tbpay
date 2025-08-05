package tb;

import com.taobao.themis.kernel.ability.register.AbilityType;
import java.util.List;

/* loaded from: classes9.dex */
public interface qpn {

    /* loaded from: classes9.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public AbilityType f33019a;
        public String b;
        public List<String> c;

        static {
            kge.a(1510488284);
            kge.a(802224767);
        }
    }

    /* loaded from: classes9.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public AbilityType f33020a;
        public Class<? extends com.taobao.themis.kernel.ability.base.a> b;

        static {
            kge.a(-925252014);
            kge.a(802224767);
        }

        public b(Class<? extends com.taobao.themis.kernel.ability.base.a> cls, AbilityType abilityType) {
            this.f33020a = abilityType;
            this.b = cls;
        }
    }

    /* loaded from: classes9.dex */
    public static class c<T extends com.taobao.themis.kernel.basic.a> implements f {

        /* renamed from: a  reason: collision with root package name */
        public Class<T> f33021a;
        public com.taobao.themis.kernel.basic.b<T> b;

        static {
            kge.a(511029881);
            kge.a(-1511918684);
        }

        public c(Class<T> cls, com.taobao.themis.kernel.basic.b<T> bVar) {
            this.f33021a = cls;
            this.b = bVar;
        }
    }

    /* loaded from: classes9.dex */
    public static class d implements f {

        /* renamed from: a  reason: collision with root package name */
        public Class<? extends com.taobao.themis.kernel.basic.a> f33022a;
        public com.taobao.themis.kernel.basic.a b;

        static {
            kge.a(1055571831);
            kge.a(-1511918684);
        }
    }

    /* loaded from: classes9.dex */
    public interface e {
    }

    /* loaded from: classes9.dex */
    public interface f {
    }

    List<e> getAbilities();

    List<f> getAdapters();
}
