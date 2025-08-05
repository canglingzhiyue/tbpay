package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class rly {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rly e;
    private SoftReference<Activity> g;
    private HashMap<View, String> d = new HashMap<>();
    private HashMap<String, rmg> f = new HashMap<>();
    private String h = "";

    /* renamed from: a  reason: collision with root package name */
    public String f33229a = "common";
    public String b = "default_detail";
    public String c = this.b;
    private ViewGroup.OnHierarchyChangeListener i = new ViewGroup.OnHierarchyChangeListener() { // from class: tb.rly.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
            } else if (view2 instanceof ViewGroup) {
                rly rlyVar = rly.this;
                rly.a(rlyVar, (ViewGroup) view2, rly.a(rlyVar));
            } else {
                rly rlyVar2 = rly.this;
                rly.a(rlyVar2, view2, rly.a(rlyVar2));
            }
        }
    };

    static {
        kge.a(-1409793696);
        kge.a(1372276108);
    }

    public static /* synthetic */ String a(rly rlyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b6194c7", new Object[]{rlyVar}) : rlyVar.h;
    }

    public static /* synthetic */ void a(rly rlyVar, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26f18c3", new Object[]{rlyVar, view, str});
        } else {
            rlyVar.a(view, str);
        }
    }

    public static /* synthetic */ void a(rly rlyVar, ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db8ee02", new Object[]{rlyVar, viewGroup, str});
        } else {
            rlyVar.a(viewGroup, str);
        }
    }

    public static rly a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rly) ipChange.ipc$dispatch("f0a1b7f", new Object[0]);
        }
        if (e == null) {
            e = new rly();
        }
        return e;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            a(activity, this.f33229a);
        }
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        this.g = new SoftReference<>(activity);
        this.h = str;
        b();
    }

    public void a(String str, rmg rmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d37af96", new Object[]{this, str, rmgVar});
        } else {
            this.f.put(str, rmgVar);
        }
    }

    public void a(View view, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158c2a0", new Object[]{this, view, str, new Boolean(z)});
            return;
        }
        HashMap<String, HashMap<String, Object>> c = rlz.a().c(str);
        if (c == null || c.size() == 0) {
            return;
        }
        a(view, c, z);
    }

    private void a(View view, HashMap<String, HashMap<String, Object>> hashMap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7261eb", new Object[]{this, view, hashMap, new Boolean(z)});
        } else if (this.g != null) {
            a(view, hashMap);
            if (!z || !(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i <= viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        a(childAt, hashMap, z);
                    } else {
                        a(childAt, hashMap);
                    }
                }
            }
        }
    }

    private void a(View view, HashMap<String, HashMap<String, Object>> hashMap) {
        SoftReference<Activity> softReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a09209", new Object[]{this, view, hashMap});
            return;
        }
        int id = view.getId();
        if (id <= 0 || (softReference = this.g) == null || softReference.get() == null) {
            return;
        }
        String resourceEntryName = this.g.get().getResources().getResourceEntryName(id);
        if (!hashMap.containsKey(resourceEntryName)) {
            return;
        }
        a(view, hashMap.get(resourceEntryName));
    }

    private rly() {
        a(EditText.class.getName(), new rmb());
        a(ImageView.class.getName(), new rmd());
        a(Button.class.getName(), new rma());
        a(ImageButton.class.getName(), new rmc());
        a(LinearLayout.class.getName(), new rme());
        a(RelativeLayout.class.getName(), new rmh());
        a(TextView.class.getName(), new rmi());
        a(ListView.class.getName(), new rmf());
        a(View.class.getName(), new rmj());
    }

    private void a(Object obj, String str, String str2, rlw rlwVar) {
        rmg rmgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f5812b", new Object[]{this, obj, str, str2, rlwVar});
        } else if (obj == null) {
        } else {
            String a2 = a(obj.getClass());
            if (TextUtils.isEmpty(a2) || !this.f.containsKey(a2) || (rmgVar = this.f.get(a2)) == null) {
                return;
            }
            rmgVar.a(obj, str, str2, rlwVar, this.c);
        }
    }

    private void a(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b7558", new Object[]{this, obj, str, str2});
        } else {
            a(obj, str, str2, (rlw) null);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SoftReference<Activity> softReference = this.g;
        if (softReference == null || softReference.get() == null) {
            return;
        }
        View decorView = this.g.get().getWindow().getDecorView();
        if (!(decorView instanceof ViewGroup)) {
            return;
        }
        a((ViewGroup) decorView, this.h);
    }

    private synchronized void a(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab4eb1", new Object[]{this, viewGroup, str});
        } else if (!this.d.containsKey(viewGroup)) {
            a((View) viewGroup, str);
            viewGroup.setOnHierarchyChangeListener(this.i);
            for (int i = 0; i <= viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, str);
                    } else if (this.d.containsKey(viewGroup)) {
                        return;
                    } else {
                        a(childAt, str);
                    }
                }
            }
        }
    }

    private void a(View view, String str) {
        SoftReference<Activity> softReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (view == null || this.g == null) {
        } else {
            int id = view.getId();
            String str2 = a().c;
            if (id <= 0 || (softReference = this.g) == null || softReference.get() == null) {
                return;
            }
            String resourceEntryName = this.g.get().getResources().getResourceEntryName(id);
            if (rlz.a().g(str2).containsKey(resourceEntryName)) {
                a((Object) view, str, resourceEntryName);
            } else if (rlz.a().d(str, str2) == null || !rlz.a().d(str, str2).containsKey(resourceEntryName)) {
            } else {
                a((Object) view, str, resourceEntryName);
            }
        }
    }

    public void a(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ced2b7e", new Object[]{this, view, str, str2});
        } else {
            a(view, str, str2, "");
        }
    }

    public void a(View view, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
        } else if (view == null) {
        } else {
            if (TextUtils.isEmpty(str3)) {
                this.c = this.b;
            } else if (!str3.equals(this.c)) {
                this.c = str3;
            }
            if (TextUtils.isEmpty(str2) || rlz.a().i(this.c) == null || !rlz.a().i(this.c).contains(str2)) {
                str2 = this.f33229a;
            }
            try {
                if (rlz.a().g(this.c).containsKey(str)) {
                    a((Object) view, str2, str);
                } else if (rlz.a().d(str2, a().c) == null || !rlz.a().d(str2, a().c).containsKey(str)) {
                } else {
                    a((Object) view, str2, str);
                }
            } catch (Throwable th) {
                rmn.a(th);
            }
        }
    }

    private void a(Object obj, HashMap<String, Object> hashMap) {
        rmg rmgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f330ef", new Object[]{this, obj, hashMap});
        } else if (obj == null || hashMap == null || hashMap.size() == 0) {
        } else {
            String a2 = a(obj.getClass());
            if (TextUtils.isEmpty(a2) || !this.f.containsKey(a2) || (rmgVar = this.f.get(a2)) == null) {
                return;
            }
            rmgVar.a(obj, hashMap, null);
        }
    }

    private String a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{this, cls});
        }
        String name = cls.getName();
        return name.equals("Object") ? "" : this.f.containsKey(name) ? name : a(cls.getSuperclass());
    }
}
