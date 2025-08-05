package com.alibaba.android.split;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class z implements y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2519a;
    private final List<String> b;
    private final boolean c;
    private final Map<String, List<String>> d = new HashMap();

    static {
        kge.a(2079248481);
        kge.a(1035756370);
    }

    public z(String str, List<String> list, boolean z) {
        this.f2519a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.alibaba.android.split.y
    public void a(Context context) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.c && (list = this.b) != null && list.size() > 0) {
            for (String str : this.b) {
                try {
                    com.alibaba.android.split.manager.b c = ((com.alibaba.android.split.manager.a) k.a()).c();
                    c.a(context, str);
                    if (c.b(str) != null) {
                        c.a(context, Arrays.asList(c.b(str).a()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fdcc0ae2", new Object[]{str}) : new a(str);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2520a;
        private boolean b;
        private List<String> c;

        static {
            kge.a(-2102151624);
        }

        private a(String str) {
            this.c = new ArrayList();
            this.f2520a = str;
        }

        public a a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2128f7a7", new Object[]{this, strArr});
            }
            if (strArr != null) {
                for (String str : strArr) {
                    this.c.add(str);
                }
            }
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("675eb09c", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fdcc0ae2", new Object[]{this, str});
            }
            this.c.add(str);
            return this;
        }

        public z a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("873eec35", new Object[]{this}) : new z(this.f2520a, this.c, this.b);
        }
    }
}
