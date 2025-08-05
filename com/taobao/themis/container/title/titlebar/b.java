package com.taobao.themis.container.title.titlebar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.title.titlebar.a;
import com.taobao.themis.pub.titlebar.action.c;
import com.taobao.themis.pub.titlebar.action.e;
import com.taobao.themis.pub.titlebar.action.j;
import com.taobao.themis.utils.k;
import com.taobao.themis.utils.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/TitleBarPositionUtils;", "", "()V", "getActionLocationAndSize", "Lcom/alibaba/fastjson/JSONObject;", "actionView", "Landroid/view/View;", "containerView", "getTagByType", "", "type", "getTypeByTag", "tag", "registerTitleBarPositionListener", "", "titleView", "Landroid/view/ViewGroup;", "pageView", "pubTitleBarPosition", "Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f22404a;
        public final /* synthetic */ com.taobao.themis.container.title.titlebar.a b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Context d;

        public a(ViewGroup viewGroup, com.taobao.themis.container.title.titlebar.a aVar, View view, Context context) {
            this.f22404a = viewGroup;
            this.b = aVar;
            this.c = view;
            this.d = context;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            View childAt = this.f22404a.getChildAt(0);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup == null) {
                return;
            }
            a.c leftPanel = this.b.getLeftPanel();
            JSONObject a2 = b.a(b.INSTANCE, viewGroup, this.c);
            if (a2 == null) {
                return;
            }
            Object obj = a2.get("height");
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            leftPanel.b(num != null ? num.intValue() : 0);
            Object obj2 = a2.get("width");
            if (!(obj2 instanceof Integer)) {
                obj2 = null;
            }
            Integer num2 = (Integer) obj2;
            leftPanel.a(num2 != null ? num2.intValue() : 0);
            Object obj3 = a2.get("x");
            if (!(obj3 instanceof Integer)) {
                obj3 = null;
            }
            Integer num3 = (Integer) obj3;
            leftPanel.c(num3 != null ? num3.intValue() : 0);
            Object obj4 = a2.get("y");
            if (!(obj4 instanceof Integer)) {
                obj4 = null;
            }
            Integer num4 = (Integer) obj4;
            leftPanel.d(num4 != null ? num4.intValue() : 0);
            leftPanel.e().clear();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View view = viewGroup.getChildAt(i);
                a.b bVar = new a.b();
                JSONObject a3 = b.a(b.INSTANCE, view, this.c);
                if (a3 != null) {
                    Object obj5 = a3.get("height");
                    if (!(obj5 instanceof Integer)) {
                        obj5 = null;
                    }
                    Integer num5 = (Integer) obj5;
                    bVar.b(num5 != null ? num5.intValue() : 0);
                    Object obj6 = a3.get("width");
                    if (!(obj6 instanceof Integer)) {
                        obj6 = null;
                    }
                    Integer num6 = (Integer) obj6;
                    bVar.a(num6 != null ? num6.intValue() : 0);
                    Object obj7 = a3.get("x");
                    if (!(obj7 instanceof Integer)) {
                        obj7 = null;
                    }
                    Integer num7 = (Integer) obj7;
                    bVar.c(num7 != null ? num7.intValue() : 0);
                    Object obj8 = a3.get("y");
                    if (!(obj8 instanceof Integer)) {
                        obj8 = null;
                    }
                    Integer num8 = (Integer) obj8;
                    bVar.d(num8 != null ? num8.intValue() : 0);
                    b bVar2 = b.INSTANCE;
                    q.b(view, "view");
                    Object tag = view.getTag();
                    if (!(tag instanceof String)) {
                        tag = null;
                    }
                    bVar.a(b.a(bVar2, (String) tag));
                    leftPanel.e().add(bVar);
                }
            }
            ViewGroup viewGroup2 = this.f22404a;
            View childAt2 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
            if (!(childAt2 instanceof ViewGroup)) {
                childAt2 = null;
            }
            ViewGroup viewGroup3 = (ViewGroup) childAt2;
            if (viewGroup3 == null) {
                return;
            }
            a.c rightPanel = this.b.getRightPanel();
            JSONObject a4 = b.a(b.INSTANCE, viewGroup3, this.c);
            if (a4 == null) {
                return;
            }
            Object obj9 = a4.get("height");
            if (!(obj9 instanceof Integer)) {
                obj9 = null;
            }
            Integer num9 = (Integer) obj9;
            rightPanel.b(num9 != null ? num9.intValue() : 0);
            Object obj10 = a4.get("width");
            if (!(obj10 instanceof Integer)) {
                obj10 = null;
            }
            Integer num10 = (Integer) obj10;
            rightPanel.a(num10 != null ? num10.intValue() : 0);
            Object obj11 = a4.get("x");
            if (!(obj11 instanceof Integer)) {
                obj11 = null;
            }
            Integer num11 = (Integer) obj11;
            rightPanel.c(num11 != null ? num11.intValue() : 0);
            Object obj12 = a4.get("y");
            if (!(obj12 instanceof Integer)) {
                obj12 = null;
            }
            Integer num12 = (Integer) obj12;
            rightPanel.d(num12 != null ? num12.intValue() : 0);
            rightPanel.e().clear();
            int childCount2 = viewGroup3.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View view2 = viewGroup3.getChildAt(i2);
                a.b bVar3 = new a.b();
                JSONObject a5 = b.a(b.INSTANCE, view2, this.c);
                if (a5 != null) {
                    Object obj13 = a5.get("height");
                    if (!(obj13 instanceof Integer)) {
                        obj13 = null;
                    }
                    Integer num13 = (Integer) obj13;
                    bVar3.b(num13 != null ? num13.intValue() : 0);
                    Object obj14 = a5.get("width");
                    if (!(obj14 instanceof Integer)) {
                        obj14 = null;
                    }
                    Integer num14 = (Integer) obj14;
                    bVar3.a(num14 != null ? num14.intValue() : 0);
                    Object obj15 = a5.get("x");
                    if (!(obj15 instanceof Integer)) {
                        obj15 = null;
                    }
                    Integer num15 = (Integer) obj15;
                    bVar3.c(num15 != null ? num15.intValue() : 0);
                    Object obj16 = a5.get("y");
                    if (!(obj16 instanceof Integer)) {
                        obj16 = null;
                    }
                    Integer num16 = (Integer) obj16;
                    bVar3.d(num16 != null ? num16.intValue() : 0);
                    b bVar4 = b.INSTANCE;
                    q.b(view2, "view");
                    Object tag2 = view2.getTag();
                    if (!(tag2 instanceof String)) {
                        tag2 = null;
                    }
                    bVar3.a(b.a(bVar4, (String) tag2));
                    rightPanel.e().add(bVar3);
                }
            }
            a.c centerPanel = this.b.getCenterPanel();
            centerPanel.d(leftPanel.d());
            centerPanel.c(leftPanel.c() + leftPanel.a());
            centerPanel.b(leftPanel.b());
            centerPanel.a(this.b.getRightPanel().c() - this.b.getLeftPanel().a());
            this.b.setTitleBarHeight(k.a(this.d, this.f22404a.getHeight() - k.b(this.d)));
            this.b.commit();
        }
    }

    static {
        kge.a(1047482804);
        INSTANCE = new b();
    }

    private b() {
    }

    public static final /* synthetic */ JSONObject a(b bVar, View view, View view2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1a46420e", new Object[]{bVar, view, view2}) : bVar.a(view, view2);
    }

    public static final /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b6a82a8", new Object[]{bVar, str}) : bVar.a(str);
    }

    @JvmStatic
    public static final void a(ViewGroup titleView, View view, com.taobao.themis.container.title.titlebar.a pubTitleBarPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa28172", new Object[]{titleView, view, pubTitleBarPosition});
            return;
        }
        q.d(titleView, "titleView");
        q.d(pubTitleBarPosition, "pubTitleBarPosition");
        Context context = titleView.getContext();
        if (context == null) {
            return;
        }
        titleView.getViewTreeObserver().addOnGlobalLayoutListener(new a(titleView, pubTitleBarPosition, view, context));
    }

    private final JSONObject a(View view, View view2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a606c448", new Object[]{this, view, view2});
        }
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        if (view2 == null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "x", (String) Integer.valueOf(k.a(context, iArr[0])));
            jSONObject2.put((JSONObject) "y", (String) Integer.valueOf(k.a(context, iArr[1])));
            jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(k.a(context, view.getWidth())));
            jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(k.a(context, view.getHeight())));
            return jSONObject;
        }
        Pair<Integer, Integer> a2 = p.a(view, view2);
        if (a2 == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "x", (String) Integer.valueOf(k.a(context, a2.getFirst().intValue())));
        jSONObject4.put((JSONObject) "y", (String) Integer.valueOf(k.a(context, a2.getSecond().intValue())));
        jSONObject4.put((JSONObject) "width", (String) Integer.valueOf(k.a(context, view.getWidth())));
        jSONObject4.put((JSONObject) "height", (String) Integer.valueOf(k.a(context, view.getHeight())));
        return jSONObject3;
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1076424827:
                return str.equals(e.TAG) ? "custom" : "";
            case -227554118:
                return str.equals(c.TAG) ? "back" : "";
            case -112219213:
                return str.equals(com.taobao.themis.pub.titlebar.action.a.TAG) ? "add-icon" : "";
            case 683420444:
                return str.equals(j.TAG) ? "menu" : "";
            case 1097315781:
                return str.equals("PubAppNameAction") ? "title" : "";
            default:
                return "";
        }
    }
}
