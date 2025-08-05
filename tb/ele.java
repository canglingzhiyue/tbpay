package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.broadcast.AliDetailSkuPVSelectedRefreshBroadcastReceiver;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.render.scroll.main.changesize.imp")
/* loaded from: classes4.dex */
public final class ele implements atg, ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f27395a = "AliSDetailPicGalleryChangeSizeExtension";
    private final List<AURARenderComponent> b = new ArrayList();
    private ArrayList<AURARenderComponent> c;
    private AURAGlobalData d;
    private AURARenderComponent e;
    private AURARenderComponent f;
    private RecyclerView g;
    private q h;
    private volatile a i;

    static {
        kge.a(538741804);
        kge.a(836884500);
        kge.a(-1823923563);
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static /* synthetic */ a a(ele eleVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7797687c", new Object[]{eleVar, aVar});
        }
        eleVar.i = aVar;
        return aVar;
    }

    public ele() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.render.scroll.AliSDetailPicGalleryChangeSizeExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.h = qVar;
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.d = aURAGlobalData;
        }
    }

    private ArrayList<AURARenderComponent> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this});
        }
        ArrayList<AURARenderComponent> arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        AURAGlobalData aURAGlobalData = this.d;
        if (aURAGlobalData == null) {
            arc.a().c("AliSDetailPicGalleryChangeSizeExtension", "getRenderComponentList", "globalData is null");
            return null;
        }
        this.c = (ArrayList) aURAGlobalData.get("render_view_item_models", ArrayList.class);
        return this.c;
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
            return;
        }
        this.e = null;
        this.f = ekkVar.f();
        RecyclerView recyclerView = this.g;
        if (recyclerView != null && this.f != null) {
            int a2 = emh.a(recyclerView.getContext(), this.g.getWidth(), this.f, emh.sDefaultDimension, false);
            emj.b(this.g, a2);
            Activity activity = (Activity) this.h.e();
            View findViewById = activity.findViewById(R.id.standard_detail_gallery_over_pull_end_extra_handler);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (eme.b(activity)) {
                    a2 = bay.b();
                }
                layoutParams.height = a2;
                findViewById.setLayoutParams(layoutParams);
            } else {
                arc.a().c("AliSDetailPicGalleryChangeSizeExtension", "onFrameComponentShownWhenIdle", "overPullExtraView is null");
            }
        }
        if (this.i != null) {
            this.i.a();
        }
        a aVar = new a(this.h.e(), c(), a(this.f));
        this.i = aVar;
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 != null) {
            recyclerView2.post(aVar);
        } else {
            aVar.run();
        }
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context b;
        private String c;
        private String d;
        private volatile boolean e;

        static {
            kge.a(1562874535);
            kge.a(-1390502639);
        }

        public a(Context context, String str, String str2) {
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.e = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ele.a(ele.this, (a) null);
            if (this.e) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction(AliDetailSkuPVSelectedRefreshBroadcastReceiver.INTENT_FILTER_ACTION);
            intent.putExtra("uniqueId", this.c);
            intent.putExtra(AliDetailSkuPVSelectedRefreshBroadcastReceiver.KEY_SELECTED_PROP_PATH, this.d);
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        }
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
            return;
        }
        this.e = this.f;
        this.f = ekkVar.f();
    }

    private String a(AURARenderComponent aURARenderComponent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && (obj = aURARenderComponent.data.fields.get(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH)) != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : (String) this.h.a("token", String.class);
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = recyclerView;
        AURARenderComponent aURARenderComponent = this.f;
        AURARenderComponent aURARenderComponent2 = this.e;
        if (this.i != null) {
            this.i.a();
        }
        if (i == 0) {
            return;
        }
        ArrayList<AURARenderComponent> b = b();
        if (b == null) {
            arc.a().c("AliSDetailPicGalleryChangeSizeExtension", "onScrolled", "renderComponentList is null");
        } else if (aURARenderComponent == null) {
            arc.a().c("AliSDetailPicGalleryChangeSizeExtension", "onScrolled", "mCurrentTriggerShowFrameComponent is null");
        } else {
            Context context = recyclerView.getContext();
            int width = recyclerView.getWidth();
            int a2 = emh.a(context, width, aURARenderComponent, emh.sDefaultDimension, false);
            if (aURARenderComponent2 == null) {
                emj.b(recyclerView, a2);
                return;
            }
            int indexOf = b.indexOf(aURARenderComponent2);
            if (-1 == indexOf) {
                ard a3 = arc.a();
                a3.c("AliSDetailPicGalleryChangeSizeExtension", "onScrolled", "cannot find " + aURARenderComponent2.key);
                return;
            }
            int a4 = emh.a(context, width, aURARenderComponent2, emh.sDefaultDimension, false);
            int i3 = a4 - a2;
            if (i3 == 0) {
                return;
            }
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(indexOf);
            if (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.itemView != null) {
                int left = findViewHolderForAdapterPosition.itemView.getLeft();
                if (left == 0) {
                    emj.b(recyclerView, a4);
                    return;
                }
                if (left < 0) {
                    f = left / width;
                } else {
                    f = left / width;
                    i3 = -i3;
                }
                emj.b(recyclerView, a4 + ((int) (f * i3)));
                return;
            }
            ard a5 = arc.a();
            a5.c("AliSDetailPicGalleryChangeSizeExtension", "onScrolled", "viewHolderOfPreFrameComponent=" + findViewHolderForAdapterPosition);
            ard a6 = arc.a();
            a6.c("AliSDetailPicGalleryChangeSizeExtension", "onScrolled", "viewHolderOfPreFrameComponent is null, indexOfPreFrameComponent=" + indexOf);
        }
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
            return;
        }
        List<AURARenderComponent> list = ekkVar.d().children;
        if (list == null) {
            return;
        }
        for (AURARenderComponent aURARenderComponent : list) {
            List<AURARenderComponent> list2 = aURARenderComponent.children;
            if (!bau.a(list2)) {
                this.b.add(list2.get(0));
            }
        }
    }
}
