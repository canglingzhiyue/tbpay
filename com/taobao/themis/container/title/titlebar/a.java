package com.taobao.themis.container.title.titlebar;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 $2\u00020\u0001:\u0004#$%&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition;", "", "()V", "centerPanel", "Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarPanel;", "getCenterPanel", "()Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarPanel;", "setCenterPanel", "(Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarPanel;)V", com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, "", "getImmersive", "()Z", "setImmersive", "(Z)V", "leftPanel", "getLeftPanel", "setLeftPanel", "rightPanel", "getRightPanel", "setRightPanel", "safeAreaInsets", "", "getSafeAreaInsets", "()[I", "titleBarHeight", "", "getTitleBarHeight", "()I", "setTitleBarHeight", "(I)V", "commit", "", "generatePosition", "Lcom/alibaba/fastjson/JSONObject;", "ActionPosition", "Companion", "NavBarItem", "NavBarPanel", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0935a Companion;
    public static final String EVENT_NAME = "updateNavbarPosition";
    public static final String TARGET = "navigator.navBarPosition";
    private boolean immersive;
    private int titleBarHeight = 44;
    private c leftPanel = new c();
    private c centerPanel = new c();
    private c rightPanel = new c();
    private final int[] safeAreaInsets = new int[4];

    static {
        kge.a(1537233288);
        Companion = new C0935a(null);
    }

    public abstract void commit();

    public final int getTitleBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fbd0c512", new Object[]{this})).intValue() : this.titleBarHeight;
    }

    public final void setTitleBarHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8d1138", new Object[]{this, new Integer(i)});
        } else {
            this.titleBarHeight = i;
        }
    }

    public final c getLeftPanel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7b1e9bd0", new Object[]{this}) : this.leftPanel;
    }

    public final void setLeftPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c95a0a", new Object[]{this, cVar});
            return;
        }
        q.d(cVar, "<set-?>");
        this.leftPanel = cVar;
    }

    public final c getCenterPanel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4f9bc09e", new Object[]{this}) : this.centerPanel;
    }

    public final void setCenterPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9f01fc", new Object[]{this, cVar});
            return;
        }
        q.d(cVar, "<set-?>");
        this.centerPanel = cVar;
    }

    public final c getRightPanel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("42c52cb9", new Object[]{this}) : this.rightPanel;
    }

    public final void setRightPanel(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776257d9", new Object[]{this, cVar});
            return;
        }
        q.d(cVar, "<set-?>");
        this.rightPanel = cVar;
    }

    public final int[] getSafeAreaInsets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("853bcab7", new Object[]{this}) : this.safeAreaInsets;
    }

    public final boolean getImmersive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d02a1610", new Object[]{this})).booleanValue() : this.immersive;
    }

    public final void setImmersive(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0fc654", new Object[]{this, new Boolean(z)});
        } else {
            this.immersive = z;
        }
    }

    public final JSONObject generatePosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eaab9a65", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "titleBarHeight", (String) Integer.valueOf(this.titleBarHeight));
        jSONObject2.put((JSONObject) "safeAreaInsets", (String) this.safeAreaInsets);
        jSONObject2.put((JSONObject) com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, (String) Boolean.valueOf(this.immersive));
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "width", (String) Integer.valueOf(this.leftPanel.a()));
        jSONObject4.put((JSONObject) "height", (String) Integer.valueOf(this.leftPanel.b()));
        jSONObject4.put((JSONObject) "left", (String) Integer.valueOf(this.leftPanel.c()));
        jSONObject4.put((JSONObject) "top", (String) Integer.valueOf(this.leftPanel.d()));
        List<b> e = this.leftPanel.e();
        ArrayList arrayList = new ArrayList(p.a((Iterable) e, 10));
        for (b bVar : e) {
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject5;
            jSONObject6.put((JSONObject) "width", (String) Integer.valueOf(bVar.a()));
            jSONObject6.put((JSONObject) "height", (String) Integer.valueOf(bVar.b()));
            jSONObject6.put((JSONObject) "left", (String) Integer.valueOf(bVar.c()));
            jSONObject6.put((JSONObject) "top", (String) Integer.valueOf(bVar.d()));
            jSONObject6.put((JSONObject) "type", bVar.e());
            arrayList.add(jSONObject5);
        }
        jSONObject4.put((JSONObject) "items", (String) arrayList);
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) "leftPanel", (String) jSONObject3);
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = jSONObject7;
        jSONObject8.put((JSONObject) "width", (String) Integer.valueOf(this.centerPanel.a()));
        jSONObject8.put((JSONObject) "height", (String) Integer.valueOf(this.centerPanel.b()));
        jSONObject8.put((JSONObject) "left", (String) Integer.valueOf(this.centerPanel.c()));
        jSONObject8.put((JSONObject) "top", (String) Integer.valueOf(this.centerPanel.d()));
        List<b> e2 = this.centerPanel.e();
        ArrayList arrayList2 = new ArrayList(p.a((Iterable) e2, 10));
        for (Iterator it = e2.iterator(); it.hasNext(); it = it) {
            b bVar2 = (b) it.next();
            JSONObject jSONObject9 = new JSONObject();
            JSONObject jSONObject10 = jSONObject9;
            jSONObject10.put((JSONObject) "width", (String) Integer.valueOf(bVar2.a()));
            jSONObject10.put((JSONObject) "height", (String) Integer.valueOf(bVar2.b()));
            jSONObject10.put((JSONObject) "left", (String) Integer.valueOf(bVar2.c()));
            jSONObject10.put((JSONObject) "top", (String) Integer.valueOf(bVar2.d()));
            jSONObject10.put((JSONObject) "type", bVar2.e());
            arrayList2.add(jSONObject9);
        }
        jSONObject8.put((JSONObject) "items", (String) arrayList2);
        t tVar2 = t.INSTANCE;
        jSONObject2.put((JSONObject) "centerPanel", (String) jSONObject7);
        JSONObject jSONObject11 = new JSONObject();
        JSONObject jSONObject12 = jSONObject11;
        jSONObject12.put((JSONObject) "width", (String) Integer.valueOf(this.rightPanel.a()));
        jSONObject12.put((JSONObject) "height", (String) Integer.valueOf(this.rightPanel.b()));
        jSONObject12.put((JSONObject) "left", (String) Integer.valueOf(this.rightPanel.c()));
        jSONObject12.put((JSONObject) "top", (String) Integer.valueOf(this.rightPanel.d()));
        List<b> e3 = this.rightPanel.e();
        ArrayList arrayList3 = new ArrayList(p.a((Iterable) e3, 10));
        for (b bVar3 : e3) {
            JSONObject jSONObject13 = new JSONObject();
            JSONObject jSONObject14 = jSONObject13;
            jSONObject14.put((JSONObject) "width", (String) Integer.valueOf(bVar3.a()));
            jSONObject14.put((JSONObject) "height", (String) Integer.valueOf(bVar3.b()));
            jSONObject14.put((JSONObject) "left", (String) Integer.valueOf(bVar3.c()));
            jSONObject14.put((JSONObject) "top", (String) Integer.valueOf(bVar3.d()));
            jSONObject14.put((JSONObject) "type", bVar3.e());
            arrayList3.add(jSONObject13);
        }
        jSONObject12.put((JSONObject) "items", (String) arrayList3);
        t tVar3 = t.INSTANCE;
        jSONObject2.put((JSONObject) "rightPanel", (String) jSONObject11);
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$Companion;", "", "()V", "EVENT_NAME", "", "TARGET", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.container.title.titlebar.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0935a {
        static {
            kge.a(1195242192);
        }

        private C0935a() {
        }

        public /* synthetic */ C0935a(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarPanel;", "", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "items", "", "Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "left", "getLeft", "setLeft", "top", "getTop", "setTop", "width", "getWidth", "setWidth", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f22403a;
        private int b;
        private int c;
        private int d;
        private List<b> e = new ArrayList();

        static {
            kge.a(180001464);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f22403a;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.f22403a = i;
            }
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }

        public final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
        }

        public final void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public final List<b> e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition$NavBarItem;", "", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "left", "getLeft", "setLeft", "top", "getTop", "setTop", "type", "", NetworkAbility.API_GET_TYPE, "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "width", "getWidth", "setWidth", "updatePosition", "", "locationAndSize", "Lcom/alibaba/fastjson/JSONObject;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f22402a;
        private int b;
        private int c;
        private int d;
        private String e = "";

        static {
            kge.a(698352607);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f22402a;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.f22402a = i;
            }
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public final void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }

        public final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
        }

        public final void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.e = str;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }
    }
}
