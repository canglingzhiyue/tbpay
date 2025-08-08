package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.b;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class hgp implements c, d.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f28628a;
    private ArrayList<ImportantEventItem> b;
    private ArrayList<ImportantEventItem> c;
    private long d;
    private com.taobao.android.live.plugin.atype.flexalocal.comments.notify.a e;
    private com.taobao.alilive.aliliveframework.frame.a f;
    private boolean g;
    private ImportantEventItem h;

    static {
        kge.a(1680009731);
        kge.a(-69219860);
        kge.a(-2101054629);
        kge.a(191318335);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 5;
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "SubCommonImportantEvent";
    }

    public static /* synthetic */ b a(hgp hgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6500fe8d", new Object[]{hgpVar}) : hgpVar.f28628a;
    }

    public static /* synthetic */ void a(hgp hgpVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3cf856", new Object[]{hgpVar, importantEventItem});
        } else {
            hgpVar.f(importantEventItem);
        }
    }

    public static /* synthetic */ void a(hgp hgpVar, ImportantEventItem importantEventItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f0f8a0", new Object[]{hgpVar, importantEventItem, str});
        } else {
            hgpVar.a(importantEventItem, str);
        }
    }

    public static /* synthetic */ ImportantEventItem b(hgp hgpVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImportantEventItem) ipChange.ipc$dispatch("20e3eb8e", new Object[]{hgpVar, importantEventItem});
        }
        hgpVar.h = importantEventItem;
        return importantEventItem;
    }

    public static /* synthetic */ boolean b(hgp hgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da6f546c", new Object[]{hgpVar})).booleanValue() : hgpVar.g;
    }

    public static /* synthetic */ ArrayList c(hgp hgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("763b043", new Object[]{hgpVar}) : hgpVar.c;
    }

    public static /* synthetic */ ArrayList d(hgp hgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("853b6c44", new Object[]{hgpVar}) : hgpVar.b;
    }

    public static /* synthetic */ void e(hgp hgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f867eb", new Object[]{hgpVar});
        } else {
            hgpVar.i();
        }
    }

    public hgp(b bVar, phq phqVar, boolean z) {
        this.f28628a = bVar;
        this.f = phqVar;
        this.g = z;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.e = new com.taobao.android.live.plugin.atype.flexalocal.comments.notify.a();
        b bVar = this.f28628a;
        if (bVar == null) {
            return;
        }
        boolean z2 = bVar.c() != null;
        if (this.f28628a.c().f() != null) {
            z = true;
        }
        if (!z2 || !z) {
            return;
        }
        this.f28628a.c().f().registerMessageListener(this, new MessageTypeFilter() { // from class: tb.hgp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 2888;
            }
        });
    }

    private void b(final ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd94058", new Object[]{this, importantEventItem});
        } else {
            this.f28628a.d().post(new Runnable() { // from class: tb.hgp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    ImportantEventItem importantEventItem2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    hgp.a(hgp.this).a(importantEventItem);
                    hgp.a(hgp.this, importantEventItem, "ImportantEventNoticeIssue");
                    if (hgp.b(hgp.this) && (importantEventItem2 = importantEventItem) != null && StringUtils.equals(importantEventItem2.isHighestPriority, "true")) {
                        hgp.a(hgp.this, importantEventItem);
                    } else if (hgp.this.a(importantEventItem)) {
                        plx.a("SubCommonImportantEventController", "onMessageReceived isNeedWaitFrontComponent true type:" + importantEventItem.type);
                        hgp.c(hgp.this).add(importantEventItem);
                    } else {
                        plx.a("SubCommonImportantEventController", "onMessageReceived addItemToList type:" + importantEventItem.type);
                        hgp.a(hgp.this, importantEventItem);
                    }
                }
            });
        }
    }

    private void c(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64ee0d9", new Object[]{this, importantEventItem});
            return;
        }
        this.f28628a.f().removeAllViews();
        DXRootView createDX = f.m().createDX(this.f28628a.f().getContext(), importantEventItem.templateName);
        if (createDX == null) {
            return;
        }
        this.f28628a.f().addView(createDX);
        if (importantEventItem == null || importantEventItem.dataMessage == null) {
            return;
        }
        importantEventItem.dataMessage.put("utParams", (Object) importantEventItem.utParams);
        f.m().renderDX(createDX, importantEventItem.dataMessage);
    }

    public void a(List<ImportantEventItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (ImportantEventItem importantEventItem : list) {
                if (this.g && StringUtils.equals(importantEventItem.isHighestPriority, "true")) {
                    this.b.add(importantEventItem);
                } else if (a(importantEventItem)) {
                    this.c.add(importantEventItem);
                    StringBuilder sb = new StringBuilder();
                    sb.append("need wait front component:");
                    sb.append(importantEventItem.type);
                    sb.append(" utParams:");
                    sb.append(importantEventItem.utParams == null ? "" : importantEventItem.utParams.showParams);
                    plx.a("SubCommonImportantEventController", sb.toString());
                } else {
                    this.b.add(importantEventItem);
                }
                this.f28628a.a(importantEventItem);
                a(importantEventItem, "ImportantEventNoticeIssue");
            }
            Collections.sort(this.b, new Comparator<ImportantEventItem>() { // from class: tb.hgp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(ImportantEventItem importantEventItem2, ImportantEventItem importantEventItem3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, importantEventItem2, importantEventItem3})).intValue() : a(importantEventItem2, importantEventItem3);
                }

                public int a(ImportantEventItem importantEventItem2, ImportantEventItem importantEventItem3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3555ba39", new Object[]{this, importantEventItem2, importantEventItem3})).intValue() : importantEventItem2.priority - importantEventItem3.priority;
                }
            });
            if (this.g) {
                return;
            }
            this.f28628a.a();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        ArrayList<ImportantEventItem> arrayList = this.b;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        plx.a("SubCommonImportantEventController", "size:" + this.b.size());
        return true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public boolean e() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.g) {
            ArrayList<ImportantEventItem> arrayList = this.b;
            if (arrayList == null || arrayList.size() <= 0) {
                z = false;
            } else {
                z = false;
                for (int i = 0; i < this.b.size(); i++) {
                    ImportantEventItem importantEventItem = this.b.get(i);
                    if (importantEventItem != null && StringUtils.equals(importantEventItem.isHighestPriority, "true")) {
                        z = true;
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    public void f() {
        View childAt;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        plx.a("SubCommonImportantEventController", "destroy");
        ddw.a().b(this);
        if (ply.y()) {
            try {
                if (this.f28628a != null && this.f28628a.f() != null) {
                    int childCount = this.f28628a.f().getChildCount();
                    if (childCount > 0 && (childAt = this.f28628a.f().getChildAt(0)) != null) {
                        Animation animation = childAt.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                        }
                        childAt.clearAnimation();
                    }
                    this.f28628a.f().removeAllViews();
                    plx.a("SubCommonImportantEventController", "destroy removeAllViews childCount：" + childCount);
                }
                if (this.f28628a != null) {
                    this.f28628a.a(false);
                    plx.a("SubCommonImportantEventController", "destroy removeAllViews endConsumeMessage");
                }
            } catch (Exception e) {
                plx.a("SubCommonImportantEventController", "destroy try catch:" + e.getMessage());
            }
        }
        b bVar = this.f28628a;
        if (bVar != null) {
            boolean z2 = bVar.c() != null;
            if (this.f28628a.c().f() == null) {
                z = false;
            }
            if (z2 & z) {
                this.f28628a.c().f().unRegisterMessageListener(this);
            }
        }
        com.taobao.android.live.plugin.atype.flexalocal.comments.notify.a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
        ArrayList<ImportantEventItem> arrayList = this.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<ImportantEventItem> arrayList2 = this.c;
        if (arrayList2 == null) {
            return;
        }
        arrayList2.clear();
    }

    public boolean a(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61639fdb", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (importantEventItem == null || importantEventItem.configInfo == null || !importantEventItem.configInfo.containsKey("name") || !importantEventItem.configInfo.containsKey("type")) {
            return false;
        }
        return StringUtils.equals(importantEventItem.configInfo.getString("type"), "h5Component") && !this.f28628a.a(importantEventItem.configInfo.getString("name"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.notify.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hgp.c():void");
    }

    private boolean d(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90c4815e", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (!ply.w()) {
            return false;
        }
        if (importantEventItem.fatigueInfo != null && importantEventItem.fatigueInfo.showNums > 0) {
            ImportantEventItem.FatigueInfo fatigueInfo = importantEventItem.fatigueInfo;
            ImportantEventItem.FatigueInfo a2 = this.e.a(importantEventItem.fatigueInfo.fatigueKey);
            if (a2 == null) {
                fatigueInfo.showNums = 1L;
            } else if (fatigueInfo.showNums <= a2.showNums) {
                plx.a("SubCommonImportantEventController", "checkFatigueInfo isHitFatigue true");
                z = true;
            } else {
                fatigueInfo.showNums = a2.showNums + 1;
                plx.a("SubCommonImportantEventController", "checkFatigueInfo writeFatigueInfo" + a2.showNums);
            }
            this.e.a(fatigueInfo);
        }
        return z;
    }

    private boolean e(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b3a21df", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (importantEventItem != null && importantEventItem.configInfo != null) {
            JSONObject jSONObject = importantEventItem.configInfo;
            if (jSONObject.containsKey("abInfo")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("abInfo");
                if (jSONObject2.containsKey("component") && jSONObject2.containsKey("module") && jSONObject2.containsKey("key")) {
                    String string = jSONObject2.getString("component");
                    String string2 = jSONObject2.getString("module");
                    String string3 = jSONObject2.getString("key");
                    plx.a("SubCommonImportantEventController", "isNotHitAB abInfo:" + string + " " + string2 + " " + string3);
                    return ply.a(string, string2, string3);
                }
            }
        }
        return true;
    }

    private HashMap<String, String> a(ImportantEventItem.UTParams uTParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("75703233", new Object[]{this, uTParams});
        }
        if (uTParams == null) {
            return new HashMap<>();
        }
        return a(uTParams.showParams);
    }

    public static HashMap<String, String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            if (!StringUtils.isEmpty(str)) {
                for (String str2 : str.split(",")) {
                    if (str2.contains("=")) {
                        String[] split2 = str2.split("=");
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        } catch (Exception e) {
            plx.a("SubCommonImportantEventController", "generateUTArgs error " + e.getMessage());
        }
        return hashMap;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            this.d = SystemClock.elapsedRealtime();
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f28628a.f().getContext(), R.anim.taolive_certification_in_flexalocal);
            loadAnimation.setAnimationListener(new a(0));
            loadAnimation.setDuration(500L);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            this.f28628a.f().clearAnimation();
            this.f28628a.f().startAnimation(loadAnimation);
        } catch (Throwable th) {
            q.b("SubCommonImportantEventController", "startAnim exception: " + th.getMessage());
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f28628a.f().getContext(), R.anim.taolive_certification_out_flexalocal);
            loadAnimation.setAnimationListener(new a(2));
            loadAnimation.setDuration(500L);
            this.f28628a.f().clearAnimation();
            this.f28628a.f().startAnimation(loadAnimation);
        } catch (Throwable th) {
            q.b("SubCommonImportantEventController", "endAnim e: " + th.getMessage());
        }
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i != 2888 || !(obj instanceof String)) {
        } else {
            try {
                b((ImportantEventItem) pqj.a((String) obj, ImportantEventItem.class));
            } catch (Exception unused) {
            }
        }
    }

    private void a(ImportantEventItem importantEventItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3721e1", new Object[]{this, importantEventItem, str});
            return;
        }
        phg.a().a(this.f, str, a(importantEventItem.utParams));
        plx.a("SubCommonImportantEventController", "showTrackInfo:" + str + " " + importantEventItem.utParams.showParams);
    }

    private void f(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afc25c", new Object[]{this, importantEventItem});
            return;
        }
        ArrayList<ImportantEventItem> arrayList = this.b;
        if (arrayList != null && arrayList.size() > 0) {
            while (true) {
                if (i < this.b.size()) {
                    if (this.b.get(i).priority <= importantEventItem.priority) {
                        if (i == this.b.size() - 1) {
                            this.b.add(importantEventItem);
                            break;
                        }
                        i++;
                    } else {
                        this.b.add(i, importantEventItem);
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            this.b.add(importantEventItem);
        }
        plx.a("SubCommonImportantEventController", "addItemToList size:" + this.b.size());
        this.f28628a.a();
    }

    public void g() {
        ImportantEventItem importantEventItem;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.g && (importantEventItem = this.h) != null && !a(importantEventItem)) {
            c();
        } else if (this.c.size() == 0) {
        } else {
            while (i < this.c.size()) {
                ImportantEventItem importantEventItem2 = this.c.get(i);
                if (importantEventItem2 != null && !a(importantEventItem2)) {
                    this.c.remove(i);
                    i--;
                    f(importantEventItem2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("tryPutSavedMessageToQueue addItemToList type:");
                    sb.append(importantEventItem2.type);
                    sb.append(" showParams:");
                    sb.append(importantEventItem2.utParams == null ? "" : importantEventItem2.utParams.showParams);
                    plx.a("SubCommonImportantEventController", sb.toString());
                }
                i++;
            }
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.important_event_goods_recommend".equals(str) && (obj instanceof ImportantEventItem)) {
            ImportantEventItem importantEventItem = (ImportantEventItem) obj;
            if (g(importantEventItem)) {
                return;
            }
            b(importantEventItem);
        } else if (xkw.c.equals(str)) {
            b bVar2 = this.f28628a;
            if (bVar2 == null || bVar2.e() == null) {
                return;
            }
            this.f28628a.e().setVisibility(8);
        } else if (!xkw.d.equals(str) || (bVar = this.f28628a) == null || bVar.e() == null) {
        } else {
            this.f28628a.e().setVisibility(0);
        }
    }

    private boolean g(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02562e1", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (hkk.x() && this.f != null && importantEventItem != null && importantEventItem.dataMessage != null) {
            String string = importantEventItem.dataMessage.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(this.f.d) && !string.equals(this.f.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.important_event_goods_recommend", xkw.c, xkw.d};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int IMPORTANT_ANIM_END = 2;
        public static final int IMPORTANT_ANIM_MIDDLE = 1;
        public static final int IMPORTANT_ANIM_START = 0;
        private int b;

        static {
            kge.a(562263912);
            kge.a(-911284573);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            hgp.a(hgp.this).f().clearAnimation();
            animation.setAnimationListener(null);
            a(this.b);
        }

        private void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i != 0) {
            } else {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(hgp.a(hgp.this).f().getContext(), R.anim.taolive_certification_in2_flexalocal);
                    loadAnimation.setAnimationListener(new a(1));
                    loadAnimation.setDuration(500L);
                    hgp.a(hgp.this).f().startAnimation(loadAnimation);
                } catch (Throwable th) {
                    q.b("SubCommonImportantEventController", "onEnterAnimationEnd exception: " + th.getMessage());
                }
            }
        }
    }
}
