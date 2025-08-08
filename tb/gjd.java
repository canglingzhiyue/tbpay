package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class gjd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_PHENIX = "PhenixPrefetch";
    public static final String TYPE_ZIP = "ZipPrefetch";

    /* renamed from: a  reason: collision with root package name */
    private int f28339a = 0;
    private Handler b;

    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void a(String str, String str2);
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(boolean z);
    }

    static {
        kge.a(-1468352467);
    }

    public static /* synthetic */ int a(gjd gjdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea5c474a", new Object[]{gjdVar})).intValue() : gjdVar.f28339a;
    }

    public static /* synthetic */ int b(gjd gjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8df4dcb", new Object[]{gjdVar})).intValue();
        }
        int i = gjdVar.f28339a;
        gjdVar.f28339a = i + 1;
        return i;
    }

    public static /* synthetic */ Handler c(gjd gjdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8fcc61cd", new Object[]{gjdVar}) : gjdVar.b;
    }

    public void a(String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b231868c", new Object[]{this, str, str2, cVar});
            return;
        }
        try {
            if (gjb.c(str)) {
                if (cVar == null) {
                    return;
                }
                cVar.a();
                return;
            }
            byte[] a2 = gjc.a(str2);
            if (a2 == null || a2.length <= 0) {
                if (cVar == null) {
                    return;
                }
                cVar.a(TYPE_ZIP, "zip download error");
                return;
            }
            gjb.b(str, a2);
            if (cVar == null) {
                return;
            }
            cVar.a();
        } catch (Exception e2) {
            Log.e("SkinPreloader", "preloadZipSync error", e2);
            if (cVar == null) {
                return;
            }
            cVar.a(TYPE_ZIP, "unzip error:" + e2.getMessage());
        }
    }

    public void a(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8567b229", new Object[]{this, list, cVar});
        } else if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(ImageStrategyDecider.decideUrl(str, 960, 960, null));
            }
            com.taobao.phenix.intf.b.h().a("common", arrayList).a(new a(list, cVar)).a();
        }
    }

    public void a(List<Pair<String, String>> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85682688", new Object[]{this, list, dVar});
            return;
        }
        this.b = new b();
        if (list != null && !list.isEmpty()) {
            new f(list, dVar).execute(new Void[0]);
        } else if (dVar == null) {
        } else {
            dVar.a(false);
        }
    }

    /* loaded from: classes5.dex */
    public class a implements com.taobao.phenix.intf.event.a<com.taobao.phenix.intf.event.e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<String> b;
        private c c;

        static {
            kge.a(-932310937);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(com.taobao.phenix.intf.event.e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, eVar})).booleanValue() : a(eVar);
        }

        public a(List<String> list, c cVar) {
            this.b = list;
            this.c = cVar;
        }

        public boolean a(com.taobao.phenix.intf.event.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fa9fe917", new Object[]{this, eVar})).booleanValue();
            }
            if (eVar == null) {
                c cVar = this.c;
                if (cVar != null) {
                    cVar.a(gjd.TYPE_PHENIX, "prefetchEvent is null");
                }
                return false;
            }
            if (eVar.f) {
                c cVar2 = this.c;
                if (cVar2 != null) {
                    cVar2.a();
                }
            } else if (gjd.a(gjd.this) <= 0 && eVar.h != null && eVar.h.size() > 0) {
                gjd.b(gjd.this);
                gjd.this.a(eVar.h, this.c);
                return false;
            } else if (this.c != null && eVar.h != null) {
                c cVar3 = this.c;
                cVar3.a(gjd.TYPE_PHENIX, "phenix prefetch error:" + (eVar.h.size() + " pic in " + this.b.size() + " error"));
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public class f extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<Pair<String, String>> b;
        private d c;

        static {
            kge.a(1506059925);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        public f(List<Pair<String, String>> list, d dVar) {
            this.b = list;
            this.c = dVar;
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            HashMap hashMap = new HashMap();
            for (Pair<String, String> pair : this.b) {
                String a2 = FestivalMgr.a().a((String) pair.first, (String) pair.second, false);
                if (StringUtils.isEmpty(a2)) {
                    gjd.c(gjd.this).sendMessage(gjd.c(gjd.this).obtainMessage(1001, this.c));
                    return null;
                } else if (!com.taobao.android.festival.utils.d.a(a2)) {
                    hashMap.put(pair, a2);
                }
            }
            if (hashMap.size() == this.b.size()) {
                e eVar = new e();
                eVar.f28342a = this.c;
                eVar.b = hashMap;
                gjd.c(gjd.this).sendMessage(gjd.c(gjd.this).obtainMessage(1003, eVar));
            } else if (hashMap.size() == 0) {
                gjd.c(gjd.this).sendMessage(gjd.c(gjd.this).obtainMessage(1000, this.c));
            } else {
                SkinConfig d = gje.a().d();
                if (d != null && !StringUtils.isEmpty(d.skinCode)) {
                    Iterator it = hashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        Pair pair2 = (Pair) it.next();
                        try {
                            byte[] a3 = gjc.a((String) hashMap.get(pair2));
                            if (a3 == null || a3.length <= 0) {
                                break;
                            }
                            gjb.a(a3, d.skinCode, (String) pair2.first, (String) pair2.second);
                        } catch (Exception e) {
                            Log.e("PreloadEngin", "verify():download pic or updateFile file error", e);
                        }
                    }
                }
                if (z) {
                    gjd.c(gjd.this).sendMessage(gjd.c(gjd.this).obtainMessage(1000, this.c));
                } else {
                    gjd.c(gjd.this).sendMessage(gjd.c(gjd.this).obtainMessage(1001, this.c));
                }
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(347495032);
        }

        public b() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1000) {
                if (!(message.obj instanceof d)) {
                    return;
                }
                ((d) message.obj).a(true);
            } else if (i == 1001) {
                if (!(message.obj instanceof d)) {
                    return;
                }
                ((d) message.obj).a(false);
            } else if (i == 1003 && (message.obj instanceof e)) {
                final e eVar = (e) message.obj;
                if (eVar.b == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair<String, String> pair : eVar.b.keySet()) {
                    String str = eVar.b.get(pair);
                    if (com.taobao.android.festival.utils.d.b(str)) {
                        str = ImageStrategyDecider.decideUrl(str, 960, 960, null);
                    }
                    arrayList.add(str);
                }
                new gjd().a(arrayList, new c() { // from class: tb.gjd.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.gjd.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (eVar.f28342a == null) {
                        } else {
                            eVar.f28342a.a(true);
                        }
                    }

                    @Override // tb.gjd.c
                    public void a(String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        } else if (eVar.f28342a == null) {
                        } else {
                            eVar.f28342a.a(false);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes5.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public d f28342a;
        public Map<Pair<String, String>, String> b;

        static {
            kge.a(-562844647);
        }

        private e() {
        }
    }
}
