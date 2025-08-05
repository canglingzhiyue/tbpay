package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ag;
import com.taobao.tao.log.TLog;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mek;
import tb.mfm;
import tb.psb;
import tb.sdt;

/* loaded from: classes6.dex */
public class h extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLVNATIVECALLCHAIN = -9101150660281637999L;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f14170a = new ArrayList();

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-539377993);
        b = h.class.getSimpleName();
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0285  */
    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r22, java.lang.Object[] r23, com.taobao.android.dinamicx.DXRuntimeContext r24) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }

    private int a(int i, String str, i iVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f656577", new Object[]{this, new Integer(i), str, iVar})).intValue();
        }
        if (iVar == null) {
            return 0;
        }
        String str2 = str + "outerOffsetY";
        Map<String, Object> hashMap = iVar.d() == null ? new HashMap<>() : iVar.d();
        if (hashMap.get(str2) instanceof Integer) {
            i2 = ((Integer) hashMap.get(str2)).intValue();
        }
        hashMap.put(str2, Integer.valueOf(i));
        iVar.a(hashMap);
        return i - i2;
    }

    private int b(int i, String str, i iVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1c07c56", new Object[]{this, new Integer(i), str, iVar})).intValue();
        }
        Map<String, Object> hashMap = iVar.d() == null ? new HashMap<>() : iVar.d();
        if (hashMap.get(str) instanceof Integer) {
            i2 = ((Integer) hashMap.get(str)).intValue();
        }
        hashMap.put(str, Integer.valueOf(i));
        iVar.a(hashMap);
        return i - i2;
    }

    private ArrayList<com.taobao.taolive.uikit.api.c> b(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("945f57a3", new Object[]{this, view});
        }
        ArrayList<com.taobao.taolive.uikit.api.c> arrayList = new ArrayList<>();
        if (view != null) {
            if (view instanceof com.taobao.taolive.uikit.api.c) {
                arrayList.add((com.taobao.taolive.uikit.api.c) view);
            }
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    ArrayList<com.taobao.taolive.uikit.api.c> b2 = b(viewGroup.getChildAt(i));
                    if (!b2.isEmpty()) {
                        arrayList.addAll(b2);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public void a(DXRuntimeContext dXRuntimeContext, String str, String str2, String str3, String str4, Integer num, int i, i iVar, boolean z, int i2, boolean z2) {
        String str5;
        DXWidgetNode queryWidgetNodeByUserId;
        DXRecyclerLayout dXRecyclerLayout;
        RecyclerView l;
        ViewPager e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc84bfb9", new Object[]{this, dXRuntimeContext, str, str2, str3, str4, num, new Integer(i), iVar, new Boolean(z), new Integer(i2), new Boolean(z2)});
            return;
        }
        int i3 = i2;
        if (sdt.f() || dXRuntimeContext == null) {
            return;
        }
        if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str2) && !com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str4)) {
            DXWidgetNode queryWidgetNodeByUserId2 = dXRuntimeContext.s().getExpandWidgetNode().queryWidgetNodeByUserId(str2);
            if ((queryWidgetNodeByUserId2 instanceof ag) && (e = ((ag) queryWidgetNodeByUserId2).e()) != null) {
                str5 = str4 + e.getCurrentItem();
                queryWidgetNodeByUserId = dXRuntimeContext.s().getExpandWidgetNode().queryWidgetNodeByUserId(str5);
                if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout) || (l = (dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId).l()) == null || !(l.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                    return;
                }
                int c = dXRecyclerLayout.n().c();
                double f = dXRecyclerLayout.n().f();
                if (!z) {
                    int b2 = b(c, "" + str + str5 + "offsetY", iVar);
                    if (c == 0 && b2 != 0) {
                        return;
                    }
                    i3 = b2;
                } else if (c != 0) {
                    return;
                }
                List<Object> c2 = dXRecyclerLayout.c();
                if (c2 == null || c2.size() <= 0) {
                    return;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) l.getLayoutManager();
                int intValue = num != null ? num.intValue() : 2;
                int[] iArr = new int[intValue];
                int[] iArr2 = new int[intValue];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                staggeredGridLayoutManager.findLastVisibleItemPositions(iArr2);
                String str6 = "" + str;
                if (!"old".equals(iVar.b())) {
                    int i4 = intValue - 1;
                    a(l, str6, Math.min(iArr[0], iArr[i4]), Math.max(iArr2[0], iArr2[i4]), c2, i, i3, iVar, z2, f);
                    return;
                }
                int i5 = intValue - 1;
                a(l, str6, Math.min(iArr[0], iArr[i5]), Math.max(iArr2[0], iArr2[i5]), c2, i, i3, iVar, dXRuntimeContext.m());
                return;
            }
        }
        str5 = str3;
        queryWidgetNodeByUserId = dXRuntimeContext.s().getExpandWidgetNode().queryWidgetNodeByUserId(str5);
        if (!(queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
        }
    }

    private void a(RecyclerView recyclerView, String str, int i, int i2, List<Object> list, int i3, int i4, i iVar, boolean z, double d) {
        String str2;
        String str3;
        int adapterPosition;
        int adapterPosition2;
        RecyclerView recyclerView2 = recyclerView;
        int i5 = i;
        int i6 = i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190ef81a", new Object[]{this, recyclerView2, str, new Integer(i5), new Integer(i6), list, new Integer(i3), new Integer(i4), iVar, new Boolean(z), new Double(d)});
        } else if (iVar == null || list == null || list.size() == 0) {
        } else {
            String str4 = str + "playViewPosList";
            Map<String, Object> hashMap = iVar.d() == null ? new HashMap<>() : iVar.d();
            if (hashMap.get(str4) instanceof List) {
                this.f14170a = (List) hashMap.get(str4);
            }
            String b2 = iVar.b();
            try {
                if (this.f14170a != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= this.f14170a.size()) {
                            break;
                        }
                        int intValue = this.f14170a.get(i7).intValue();
                        RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(intValue);
                        if (findViewHolderForLayoutPosition == null) {
                            psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, false);
                            this.f14170a = new ArrayList();
                            break;
                        }
                        ArrayList<com.taobao.taolive.uikit.api.c> b3 = b(findViewHolderForLayoutPosition.itemView);
                        if (b3.size() > 0) {
                            com.taobao.taolive.uikit.api.c cVar = b3.get(0);
                            if (intValue < i5 || intValue > i6) {
                                cVar.destroy();
                                this.f14170a.remove(Integer.valueOf(intValue));
                            }
                        }
                        i7++;
                    }
                    hashMap.put(str4, this.f14170a);
                    iVar.a(hashMap);
                }
                str2 = "two";
            } catch (Exception unused) {
            }
            if (z && (d > com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.m() || b2.equals(str2))) {
                return;
            }
            if (i4 < 0) {
                while (i6 >= i5) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(i6);
                    if (findViewHolderForAdapterPosition != null && (adapterPosition2 = findViewHolderForAdapterPosition.getAdapterPosition()) < list.size()) {
                        if (list.get(adapterPosition2) instanceof JSONObject) {
                            float a2 = a(findViewHolderForAdapterPosition.itemView, i3);
                            ArrayList<com.taobao.taolive.uikit.api.c> b4 = b(findViewHolderForAdapterPosition.itemView);
                            if (b4.size() > 0) {
                                com.taobao.taolive.uikit.api.c cVar2 = b4.get(0);
                                if (cVar2.isPlaying()) {
                                    if (((double) a2) < 1.0d && !z) {
                                        cVar2.destroy();
                                        this.f14170a.remove(Integer.valueOf(adapterPosition2));
                                        hashMap.put(str4, this.f14170a);
                                        iVar.a(hashMap);
                                    }
                                } else if (b2.equals(str2)) {
                                    if ((this.f14170a == null || this.f14170a.size() <= 1) && a2 >= 1.0d && a(cVar2, iVar, str4, adapterPosition2)) {
                                        this.f14170a = b(str4, adapterPosition2, iVar);
                                    }
                                } else {
                                    if (this.f14170a.size() < (b2.equals("scrollAndTwo") ? 2 : 1) && a2 >= 1.0d && a(cVar2, iVar, str4, adapterPosition2)) {
                                        this.f14170a = b(str4, adapterPosition2, iVar);
                                    }
                                }
                            }
                        }
                    }
                    i6--;
                    i5 = i;
                }
            } else {
                int i8 = i;
                while (i8 <= i6) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(i8);
                    if (findViewHolderForAdapterPosition2 != null && (adapterPosition = findViewHolderForAdapterPosition2.getAdapterPosition()) < list.size() && (list.get(adapterPosition) instanceof JSONObject)) {
                        float a3 = a(findViewHolderForAdapterPosition2.itemView, i3);
                        ArrayList<com.taobao.taolive.uikit.api.c> b5 = b(findViewHolderForAdapterPosition2.itemView);
                        if (b5.size() > 0) {
                            com.taobao.taolive.uikit.api.c cVar3 = b5.get(0);
                            if (cVar3.isPlaying()) {
                                String str5 = str4;
                                if (((double) a3) < 1.0d && !z) {
                                    try {
                                        cVar3.destroy();
                                        this.f14170a.remove(Integer.valueOf(adapterPosition));
                                        str4 = str5;
                                        hashMap.put(str4, this.f14170a);
                                        iVar.a(hashMap);
                                    } catch (Exception unused2) {
                                        str4 = str5;
                                        TLog.loge(b, "dx video startPlay exception!!!");
                                        hashMap.put(str4, this.f14170a);
                                        iVar.a(hashMap);
                                    }
                                } else {
                                    str4 = str5;
                                }
                            } else {
                                if (b2.equals(str2)) {
                                    if (this.f14170a == null || this.f14170a.size() <= 1) {
                                        str3 = str2;
                                        if (a3 >= 1.0d && a(cVar3, iVar, str4, adapterPosition)) {
                                            this.f14170a = b(str4, adapterPosition, iVar);
                                        }
                                    }
                                } else {
                                    str3 = str2;
                                    if (this.f14170a.size() < (b2.equals("scrollAndTwo") ? 2 : 1)) {
                                        if (a3 >= 1.0d && a(cVar3, iVar, str4, adapterPosition)) {
                                            this.f14170a = b(str4, adapterPosition, iVar);
                                        }
                                        i8++;
                                        recyclerView2 = recyclerView;
                                        str2 = str3;
                                        i6 = i2;
                                    }
                                }
                                i8++;
                                recyclerView2 = recyclerView;
                                str2 = str3;
                                i6 = i2;
                            }
                        }
                    }
                    str3 = str2;
                    i8++;
                    recyclerView2 = recyclerView;
                    str2 = str3;
                    i6 = i2;
                }
            }
            hashMap.put(str4, this.f14170a);
            iVar.a(hashMap);
        }
    }

    private boolean a(com.taobao.taolive.uikit.api.c cVar, i iVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a879214", new Object[]{this, cVar, iVar, str, new Integer(i)})).booleanValue();
        }
        cVar.setPageId(com.taobao.live.home.c.PLAY_PAGEID);
        cVar.setSubBusinessType(com.taobao.live.home.c.PLAY_SUBBUSINESS_TYPE);
        if (mfm.f()) {
            cVar.setCloseSkipPlaySwitch(true);
        }
        cVar.setEnableCoverFade(true);
        cVar.setAnimateTime(mfm.o());
        cVar.setPlayDuration(0);
        cVar.setVideoLoop(true);
        return cVar.playVideo(new com.taobao.taolive.uikit.api.a() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.DXTblvNativeCallChainEventHandler$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.uikit.api.a
            public void onError(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.taolive.uikit.api.a
            public void onInfo(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("44be144f", new Object[]{this, new Integer(i2)});
                }
            }
        }, new com.taobao.taolive.uikit.api.b() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.uikit.api.b
            public void onMediaError(int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.taolive.uikit.api.b
            public void onMediaInfo(long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
        if ((com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(r26, r25.f()) - ((r13[1] + r7.itemView.getHeight()) + com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(r26, r25.e()))) >= com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(r26, 60.0f)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.support.v7.widget.RecyclerView r18, java.lang.String r19, int r20, int r21, java.util.List<java.lang.Object> r22, int r23, int r24, com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i r25, android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.a(android.support.v7.widget.RecyclerView, java.lang.String, int, int, java.util.List, int, int, com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.i, android.content.Context):void");
    }

    public List<Integer> b(String str, int i, i iVar) {
        List<Integer> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54d31d98", new Object[]{this, str, new Integer(i), iVar});
        }
        PrintStream printStream = System.out;
        printStream.println("shanxia,:" + i);
        Map<String, Object> hashMap = iVar.d() == null ? new HashMap<>() : iVar.d();
        if (hashMap.get(str) == null) {
            list = new ArrayList<>();
        } else {
            list = (List) hashMap.get(str);
        }
        list.add(Integer.valueOf(i));
        hashMap.put(str, list);
        iVar.a(hashMap);
        return list;
    }

    public void a(String str, int i, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85e85f0", new Object[]{this, str, new Integer(i), iVar});
            return;
        }
        String str2 = str + "playViewPos";
        Map<String, Object> hashMap = iVar.d() == null ? new HashMap<>() : iVar.d();
        hashMap.put(str2, Integer.valueOf(i));
        iVar.a(hashMap);
    }

    public boolean a(View view, JSONObject jSONObject, final mek.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef002e49", new Object[]{this, view, jSONObject, bVar})).booleanValue();
        }
        if (view != null && jSONObject != null) {
            ArrayList<com.taobao.taolive.uikit.api.c> b2 = b(view);
            if (b2.size() > 0) {
                Iterator<com.taobao.taolive.uikit.api.c> it = b2.iterator();
                while (it.hasNext()) {
                    com.taobao.taolive.uikit.api.c next = it.next();
                    if (next != null) {
                        if (next.isPlaying()) {
                            return true;
                        }
                        psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, false);
                        next.setPageId(com.taobao.live.home.c.PLAY_PAGEID);
                        next.setSubBusinessType(com.taobao.live.home.c.PLAY_SUBBUSINESS_TYPE);
                        if (mfm.f()) {
                            next.setCloseSkipPlaySwitch(true);
                        }
                        next.setEnableCoverFade(true);
                        next.setAnimateTime(mfm.o());
                        next.setPlayDuration(0);
                        next.setVideoLoop(true);
                        return next.playVideo(new com.taobao.taolive.uikit.api.a() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.uikit.api.a
                            public void onError(int i) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
                                }
                            }

                            @Override // com.taobao.taolive.uikit.api.a
                            public void onInfo(int i) {
                                mek.b bVar2;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
                                } else if (i != 100003 || (bVar2 = bVar) == null) {
                                } else {
                                    bVar2.a();
                                }
                            }
                        }, new com.taobao.taolive.uikit.api.b() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.uikit.api.b
                            public void onMediaError(int i, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
                                }
                            }

                            @Override // com.taobao.taolive.uikit.api.b
                            public void onMediaInfo(long j, long j2, long j3, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
                                }
                            }
                        });
                    }
                }
            }
        }
        return false;
    }

    public float a(View view, int i) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3afcc9", new Object[]{this, view, new Integer(i)})).floatValue();
        }
        if (view == null || (height = view.getHeight()) == 0) {
            return 0.0f;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.top == 0 && height > i + rect.height()) {
            return 0.0f;
        }
        return rect.height() / height;
    }
}
