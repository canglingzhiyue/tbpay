package com.taobao.android.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.juh;
import tb.juk;
import tb.kge;

/* loaded from: classes6.dex */
public class r implements q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context b;
    private final String c;
    private final WeexInstanceMode d;
    private final WeexRenderType e;
    private final JSONObject f;
    private final com.taobao.android.weex.config.b g;
    private WeexInstance i;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<Runnable> f15878a = new LinkedList<>();
    private boolean h = false;
    private List<h> j = new ArrayList();

    static {
        kge.a(863965968);
        kge.a(-1306843952);
    }

    public static /* synthetic */ WeexInstance a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("680d5d72", new Object[]{rVar}) : rVar.i;
    }

    public static /* synthetic */ void a(r rVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8372824b", new Object[]{rVar, aVar});
        } else {
            rVar.a(aVar);
        }
    }

    public r(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar) {
        this.b = context;
        this.c = str;
        this.d = weexInstanceMode;
        this.e = weexRenderType;
        this.f = jSONObject;
        this.g = bVar;
    }

    @Override // com.taobao.android.weex.q
    public q a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("6afe89c3", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        this.h = true;
        this.f15878a.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                r.a(r.this).updateContainerSize(i, i2);
                juh juhVar = (juh) r.a(r.this).getExtend(juh.class);
                if (juhVar == null) {
                    return;
                }
                juhVar.a(i, i2);
            }
        });
        return this;
    }

    @Override // com.taobao.android.weex.q
    public q a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("866f32ad", new Object[]{this, str});
        }
        this.f15878a.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    r.a(r.this).initWithURL(str);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.android.weex.q
    public q a(final WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("e1927d1f", new Object[]{this, weexValue});
        }
        this.f15878a.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    r.a(r.this).render(weexValue);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.android.weex.q
    public q a(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("fb167f09", new Object[]{this, str, obj});
        }
        this.f15878a.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    r.a(r.this).setTag(str, obj);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.android.weex.q
    public q a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("41ff0987", new Object[]{this, hVar});
        }
        this.j.add(hVar);
        return this;
    }

    @Override // com.taobao.android.weex.q
    public q.a a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q.a) ipChange.ipc$dispatch("987537ff", new Object[]{this, sVar});
        }
        final a aVar = new a(sVar);
        com.taobao.android.weex_framework.util.j.c(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    r.a(r.this, aVar);
                }
            }
        });
        return aVar;
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d723bae5", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.weex.config.b bVar = this.g;
        if (this.h) {
            if (bVar == null) {
                bVar = new com.taobao.android.weex.config.b();
            }
            WeexUnicornConfig a2 = bVar.a();
            if (a2 == null) {
                a2 = new WeexUnicornConfig();
                bVar.a(a2);
            }
            a2.b(true);
        }
        this.i = ((WeexFactoryImpl) com.taobao.android.weex.a.getInstance()).createInstanceInternal(this.b, this.c, this.d, this.e, this.f, bVar, null, true);
        for (h hVar : this.j) {
            this.i.addInstanceListener(hVar);
        }
        Iterator<Runnable> it = this.f15878a.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        aVar.a(this.i);
    }

    @Override // com.taobao.android.weex.q
    public s.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.a) ipChange.ipc$dispatch("a79e2d04", new Object[]{this});
        }
        com.taobao.android.weex.util.c.a(!com.taobao.android.weex_framework.util.j.a());
        a aVar = new a(new s() { // from class: com.taobao.android.weex.r.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.s
            public void a(s.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8d89384", new Object[]{this, aVar2});
                }
            }
        });
        a(aVar);
        return aVar;
    }

    /* loaded from: classes6.dex */
    public static class a implements q.a, s.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final s f15885a;
        private volatile WeexInstance b = null;
        private boolean c = false;
        private boolean d = false;

        static {
            kge.a(-434412463);
            kge.a(281512111);
            kge.a(-529105536);
        }

        public static /* synthetic */ WeexInstance a(a aVar, WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("528e1711", new Object[]{aVar, weexInstance});
            }
            aVar.b = weexInstance;
            return weexInstance;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d723bae9", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14437f04", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        public static /* synthetic */ WeexInstance c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("e040ae31", new Object[]{aVar}) : aVar.b;
        }

        public a(s sVar) {
            this.f15885a = sVar;
        }

        public synchronized void a(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd7ec586", new Object[]{this, weexInstance});
                return;
            }
            this.b = weexInstance;
            com.taobao.android.weex_framework.util.j.b(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (a.a(a.this)) {
                    } else {
                        a.b(a.this);
                    }
                }
            });
        }

        @Override // com.taobao.android.weex.s.a
        public void b(WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19e758b9", new Object[]{this, weexEventTarget, str, weexValue});
            } else if (this.b == null) {
            } else {
                this.b.dispatchEvent(weexEventTarget, str, weexValue);
            }
        }

        @Override // com.taobao.android.weex.s.a
        public void b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            } else if (this.b == null) {
            } else {
                this.b.setTag(str, obj);
            }
        }

        @Override // com.taobao.android.weex.s.a
        public synchronized WeexInstance a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstance) ipChange.ipc$dispatch("b6a67f14", new Object[]{this, context});
            }
            com.taobao.android.weex.util.c.a(com.taobao.android.weex_framework.util.j.a());
            if (this.c) {
                return null;
            }
            this.c = true;
            this.b.resetContext(context);
            juk jukVar = (juk) this.b.getExtend(juh.class);
            if (jukVar != null) {
                jukVar.b();
            }
            return this.b;
        }

        @Override // com.taobao.android.weex.s.a
        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c) {
            } else {
                this.c = true;
                com.taobao.android.weex_framework.util.j.a(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex.r.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        a.c(a.this).destroy();
                        a.a(a.this, null);
                    }
                });
            }
        }

        @Override // com.taobao.android.weex.q.a
        public synchronized boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            WeexInstance weexInstance = this.b;
            if (this.d) {
                return false;
            }
            if (weexInstance == null) {
                return false;
            }
            b();
            return true;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.d = true;
            this.f15885a.a(this);
        }
    }
}
