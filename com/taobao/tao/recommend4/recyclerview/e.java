package com.taobao.tao.recommend4.recyclerview;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.jbg;
import tb.kge;
import tb.ksp;
import tb.osm;
import tb.otc;

/* loaded from: classes8.dex */
public class e implements RecyclerView.OnChildAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f20977a;
    private static Handler b;
    private osm c;

    static {
        kge.a(495805059);
        kge.a(-1469681034);
        HandlerThread a2 = jbg.a("recommend4.ActionTrackChildExpose");
        f20977a = a2;
        a2.start();
        b = new Handler(f20977a.getLooper());
    }

    public e(h hVar) {
        this.c = hVar.b;
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517542da", new Object[]{this, view});
        } else if (!(view.getParent() instanceof ChildRecyclerView)) {
        } else {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            int position = recyclerView.getLayoutManager().getPosition(view);
            JSONObject a2 = ((h) recyclerView.getAdapter()).a(position);
            if (a2 == null || a2.getJSONObject("ext") == null || a2.getJSONObject("ext").getBooleanValue("hidden")) {
                return;
            }
            if (a2.getBooleanValue(com.taobao.realtimerecommend.j.IS_USER_ACTION_TRACKED)) {
                a2.put("isFirstAppear", (Object) false);
            } else {
                a2.put("isFirstAppear", (Object) true);
            }
            a2.put(com.taobao.realtimerecommend.j.IS_USER_ACTION_TRACKED, (Object) true);
            ksp.b("real_time_rec", "fast expose sectionBizCode = " + a2.getString("sectionBizCode") + " position=" + position);
            JSONObject jSONObject = a2.getJSONObject("args");
            if (jSONObject == null) {
                return;
            }
            jSONObject.put("realExposeIndex", (Object) Integer.valueOf(position));
            if (jSONObject.getJSONObject("utLogMapEdge") != null) {
                b(a2, view, position);
            } else if (jSONObject.getString("utLogMap") != null) {
                c(a2, view, position);
            } else {
                a(a2, view, position);
            }
            otc a3 = a();
            if (a3 == null) {
                return;
            }
            a3.a(view);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
        } else if (!(view.getParent() instanceof ChildRecyclerView)) {
        } else {
            RecyclerView recyclerView = (RecyclerView) view.getParent();
            JSONObject a2 = ((h) recyclerView.getAdapter()).a(recyclerView.getLayoutManager().getPosition(view));
            if (a2 == null || a2.getJSONObject("ext") == null || a2.getJSONObject("ext").getBooleanValue("hidden") || a2.getJSONObject("args") == null) {
                return;
            }
            JSONObject jSONObject = a2.getJSONObject(com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
            String str2 = "";
            if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("arg1"))) {
                str = str2;
            } else {
                str2 = jSONObject.getString("arg1");
                str = jSONObject.getString("page");
            }
            a(new com.taobao.realtimerecommend.c(view, (String) view.getTag(R.id.tag_guess_item_id), str, str2));
            otc a3 = a();
            if (a3 == null) {
                return;
            }
            a3.b(view);
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            b.post(runnable);
        }
    }

    private void a(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76bbf9", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.realtimerecommend.j.c(jSONObject, view, i);
                    } catch (Throwable th) {
                        TLog.loge("recommend4.RecommendActionTrackChildListener", "trackAppear error.", th);
                    }
                }
            });
        }
    }

    private void b(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5863d318", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.realtimerecommend.j.b(jSONObject, view, i);
                    }
                }
            });
        }
    }

    private void c(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e550ea37", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.realtimerecommend.j.a(jSONObject, view, i);
                    }
                }
            });
        }
    }

    private otc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otc) ipChange.ipc$dispatch("f08d9c0", new Object[]{this});
        }
        osm osmVar = this.c;
        if (osmVar != null) {
            return osmVar.a();
        }
        return null;
    }
}
