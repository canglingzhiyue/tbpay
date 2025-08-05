package tb;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.tbmainfragment.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class aey extends aec<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1506384819);
    }

    public aey(bbz bbzVar) {
        super(bbzVar);
    }

    @Override // tb.abg
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        String str = null;
        if (intent.hasExtra(beg.e)) {
            str = intent.getStringExtra(beg.e);
        } else if (intent.hasExtra("from")) {
            str = intent.getStringExtra("from");
        }
        if (TextUtils.isEmpty(str) || !TextUtils.equals(beg.g, str)) {
            return false;
        }
        String stringExtra = intent.getStringExtra("cartIds");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        TBBaseFragment.registerTBLifecycleCallbacks(new a(this.f25281a, stringExtra));
        return true;
    }

    /* loaded from: classes5.dex */
    public static class a extends l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<bbz> f25295a;
        private String b;
        private Handler c = new Handler(Looper.getMainLooper());

        static {
            kge.a(2142065375);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f4c5546", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }

        public a(bbz bbzVar, String str) {
            this.f25295a = new WeakReference<>(bbzVar);
            this.b = str;
        }

        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                return;
            }
            TBBaseFragment.unRegisterTBLifecycleCallbacks(this);
            long a2 = jqi.a("iCart", "modalBuyUpdateDelayTime", 0);
            if (a2 > 0) {
                this.c.postDelayed(new Runnable() { // from class: tb.aey.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this);
                        }
                    }
                }, a2);
            } else {
                a();
            }
        }

        private void a() {
            IDMComponent e;
            Map<String, List<b>> eventMap;
            List<b> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final bbz bbzVar = this.f25295a.get();
            if (bbzVar == null || bbzVar.m().isFinishing() || this.b == null || (e = bbzVar.n().e("submit")) == null || (eventMap = e.getEventMap()) == null || (list = eventMap.get("deleteAfterModalBuy")) == null) {
                return;
            }
            for (b bVar : list) {
                if (bVar != null && "deleteAfterModalBuy".equals(bVar.getType())) {
                    final List<String> a2 = a(this.b, bbzVar);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.addAll(a2);
                    e.getFields().put("operateItems", (Object) jSONArray);
                    bmz a3 = bbzVar.F().a();
                    a3.a(bVar.getType());
                    a3.a(e);
                    a3.c("deleteAfterModalBuy");
                    a3.a("operateItems", a2);
                    a3.a(bVar);
                    bbzVar.a(e, a3, true, new jnv() { // from class: tb.aey.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                            }
                        }

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                                return;
                            }
                            for (String str : a2) {
                                bbzVar.n().a(jnyVar.b(str));
                            }
                            bbzVar.r().a();
                        }
                    }, null);
                    jqg.b("iCart", "触发极简下单删除，cartIds=" + this.b);
                    return;
                }
            }
        }

        private List<String> a(String str, bbz bbzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("76b3f71f", new Object[]{this, str, bbzVar});
            }
            ArrayList arrayList = new ArrayList();
            List asList = Arrays.asList(str.split(","));
            List<IDMComponent> m = ((com.taobao.android.ultron.datamodel.imp.b) bbzVar.O()).m();
            if (m == null) {
                return arrayList;
            }
            for (IDMComponent iDMComponent : m) {
                if (asList.contains(bei.h(iDMComponent))) {
                    arrayList.add(iDMComponent.getKey());
                    if (asList.size() == 1) {
                        break;
                    }
                }
            }
            return arrayList;
        }
    }
}
