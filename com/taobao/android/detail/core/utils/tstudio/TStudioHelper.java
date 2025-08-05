package com.taobao.android.detail.core.utils.tstudio;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.tstudio.TStudioInterface;
import com.taobao.android.tstudio.b;
import com.taobao.android.tstudio.c;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ecu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TStudioHelper implements TStudioInterface.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TStudioHelper b;

    /* renamed from: a  reason: collision with root package name */
    private TStudioInterface f9945a;
    private a c;
    private b d;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(-494773232);
        kge.a(184510197);
    }

    private TStudioHelper() {
        if (ecu.H) {
            this.f9945a = c.a("taobao_detail");
            TStudioInterface tStudioInterface = this.f9945a;
            if (tStudioInterface != null) {
                tStudioInterface.register(this);
            } else {
                i.a("TStudioHelper", "mTStudioInterface is null !!");
            }
            this.d = new b("taobao_detail");
        }
        emu.a("com.taobao.android.detail.core.utils.tstudio.TStudioHelper");
    }

    public static synchronized TStudioHelper a() {
        synchronized (TStudioHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TStudioHelper) ipChange.ipc$dispatch("e40de70d", new Object[0]);
            }
            if (b == null) {
                b = new TStudioHelper();
            }
            return b;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f9945a != null && ecu.H && this.f9945a.isEnabled();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9f36ea", new Object[]{this, aVar});
        } else if (!b() || aVar == null) {
        } else {
            this.c = aVar;
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5960b2ab", new Object[]{this, aVar});
        } else if (!b() || aVar == null) {
        } else {
            this.c = null;
        }
    }

    public boolean a(Class cls, View view, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("716da07f", new Object[]{this, cls, view, obj, new Boolean(z)})).booleanValue();
        }
        if (!b() || !a().a(cls, view, z)) {
            return false;
        }
        a().a(obj);
        return true;
    }

    public void a(com.taobao.android.tstudio.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11364ce", new Object[]{this, aVar});
            return;
        }
        if (b() && aVar != null) {
            try {
                if (this.f9945a == null) {
                    return;
                }
                this.f9945a.sendMessage(aVar);
            } catch (Throwable unused) {
            }
        }
    }

    public <T> boolean a(Class<T> cls, Object obj, boolean z) {
        TStudioInterface tStudioInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481c7487", new Object[]{this, cls, obj, new Boolean(z)})).booleanValue();
        }
        if (b() && (tStudioInterface = this.f9945a) != null) {
            return tStudioInterface.addDecorView(cls, obj, z);
        }
        return false;
    }

    public void a(boolean z) {
        TStudioInterface tStudioInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!b() || (tStudioInterface = this.f9945a) == null) {
        } else {
            tStudioInterface.enableAssistant(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!b() || this.d == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("bizName", "taobao_detail");
            hashMap.put("containerType", z ? "new-ultron" : "");
            com.taobao.android.tstudio.a f = this.d.f(hashMap);
            f.d = "event_detail_page_enter";
            a(f);
            a(true);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!b() || this.d == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("bizName", "taobao_detail");
            hashMap.put("containerType", "");
            a(this.d.g(hashMap));
            a(false);
        }
    }

    public void a(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (b() && list != null) {
            HashMap hashMap = new HashMap();
            for (Object obj : list) {
                if (obj instanceof IDMComponent) {
                    Map<String, Object> b2 = b((IDMComponent) obj);
                    hashMap.put((String) b2.get("key"), b2);
                }
            }
            a(this.d.c(hashMap));
        }
    }

    public void a(Object obj) {
        b bVar;
        com.taobao.android.tstudio.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!b() || obj == null || (bVar = this.d) == null) {
        } else {
            if (obj instanceof com.taobao.android.detail.core.model.viewmodel.main.c) {
                d = bVar.d(b(((com.taobao.android.detail.core.model.viewmodel.main.c) obj).dmComponent));
            } else if (obj instanceof IDMComponent) {
                d = bVar.d(b((IDMComponent) obj));
            } else {
                d = bVar.d(obj);
            }
            a(d);
        }
    }

    public void a(Map<String, Object> map, String str, String str2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d1898e9", new Object[]{this, map, str, str2, obj, obj2});
        } else if (!b() || this.d == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("apiName", str);
            hashMap.put("apiVersion", str2);
            hashMap.put("request", obj);
            hashMap.put(InputFrame3.TYPE_RESPONSE, obj2);
            if (map != null) {
                hashMap.putAll(map);
            }
            a(this.d.a(hashMap));
        }
    }

    public void b(Object obj) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!b() || (bVar = this.d) == null || !(obj instanceof IDMComponent)) {
        } else {
            a(bVar.b(b((IDMComponent) obj)));
        }
    }

    public void c(Object obj) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (!b() || (bVar = this.d) == null || !(obj instanceof IDMComponent)) {
        } else {
            a(bVar.b(b((IDMComponent) obj)));
        }
    }

    public void d(Object obj) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
        } else if (!b() || (bVar = this.d) == null) {
        } else {
            a(bVar.e(obj));
        }
    }

    public String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent});
        }
        if (!b()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (iDMComponent != null) {
            try {
                String type = iDMComponent.getType();
                String id = iDMComponent.getId();
                if (!TextUtils.isEmpty(type)) {
                    sb.append(type);
                }
                if (!TextUtils.isEmpty(id)) {
                    sb.append("_");
                    sb.append(id);
                }
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    private Map<String, Object> b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67a7e200", new Object[]{this, iDMComponent});
        }
        HashMap hashMap = new HashMap();
        if (b() && iDMComponent != null) {
            try {
                hashMap.put("dinamicX", iDMComponent.getContainerInfo());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) iDMComponent.getType());
                jSONObject.put("tag", (Object) iDMComponent.getTag());
                jSONObject.put("key", (Object) iDMComponent.getKey());
                jSONObject.put("id", (Object) iDMComponent.getId());
                jSONObject.put("events", (Object) iDMComponent.getEvents());
                jSONObject.put("fields", (Object) iDMComponent.getFields());
                hashMap.put("ultron", jSONObject);
                hashMap.put("key", a(iDMComponent));
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public void a(final View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293f8cc6", new Object[]{this, view, obj});
            return;
        }
        if (b() && view != null && obj != null) {
            try {
                final View view2 = (View) view.getTag(R.id.tag_tstudio_mask);
                if (view2 == null) {
                    return;
                }
                view2.post(new Runnable() { // from class: com.taobao.android.detail.core.utils.tstudio.TStudioHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, view.getMeasuredHeight()));
                        }
                    }
                });
                view2.setTag(R.id.tag_tstudio_vm, obj);
            } catch (Throwable unused) {
            }
        }
    }

    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (!b() || view == null || !b()) {
            return view;
        }
        final FrameLayout frameLayout = new FrameLayout(view.getContext());
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        frameLayout.addView(view, layoutParams);
        CustomClickView customClickView = new CustomClickView(view.getContext());
        frameLayout.setTag(R.id.tag_tstudio_mask, customClickView);
        frameLayout.addView(customClickView, new FrameLayout.LayoutParams(-1, -2));
        customClickView.setOnTapListener(new CustomClickView.a() { // from class: com.taobao.android.detail.core.utils.tstudio.TStudioHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.utils.tstudio.TStudioHelper.CustomClickView.a
            public boolean a(View view2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9501e36e", new Object[]{this, view2})).booleanValue() : TStudioHelper.a().a(null, frameLayout, view2.getTag(R.id.tag_tstudio_vm), true);
            }
        });
        return frameLayout;
    }

    /* loaded from: classes4.dex */
    public static class CustomClickView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a mOnTapListener;

        /* loaded from: classes4.dex */
        public interface a {
            boolean a(View view);
        }

        static {
            kge.a(1649507112);
        }

        public static /* synthetic */ Object ipc$super(CustomClickView customClickView, String str, Object... objArr) {
            if (str.hashCode() == -1447998406) {
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public CustomClickView(Context context) {
            super(context);
        }

        public CustomClickView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CustomClickView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void setOnTapListener(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55df8e07", new Object[]{this, aVar});
            } else {
                this.mOnTapListener = aVar;
            }
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            if (isEnabled() && motionEvent.getAction() == 0 && (aVar = this.mOnTapListener) != null && aVar.a(this)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }
}
