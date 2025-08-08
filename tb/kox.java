package tb;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.business.videocollection.poplayer.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.remote.collectionpoplayer.Request.RelatedCollectionRequest;
import com.taobao.android.fluid.remote.collectionpoplayer.Request.RelatedCollectionResult;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a;
import com.taobao.android.nav.Nav;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kov;

/* loaded from: classes5.dex */
public class kox {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTENT = "content";
    public static final double MARGIN_RATIO = 0.08d;
    public static final int SPAN_COUNT = 3;
    public static final String TAG = "CollectionServiceConfig";
    public static final String TYPE = "type";
    public static final String X_COLLECTION_ID = "x_collection_id";
    public static final String X_COLLECTION_TYPE = "x_collection_type";
    public static final String X_OBJECT_ID = "x_object_id";

    static {
        kge.a(-206935964);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : b.e() && !StringUtils.isEmpty(str);
    }

    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.taobao.android.fluid.core.FluidContext, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static void a(RecyclerView.ViewHolder viewHolder, RelatedCollectionResult relatedCollectionResult, RelatedCollectionResult relatedCollectionResult2, String str, FluidContext fluidContext, PopupDialog popupDialog) {
        ?? r12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2f8db4", new Object[]{viewHolder, relatedCollectionResult, relatedCollectionResult2, str, fluidContext, popupDialog});
        } else if ((relatedCollectionResult == null || relatedCollectionResult.result == null) && (relatedCollectionResult2 == null || relatedCollectionResult2.result == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBindViewHolder: 类型数据为空");
            sb.append(relatedCollectionResult == null ? "typelist is null" : relatedCollectionResult.toString());
            sb.append(relatedCollectionResult2 == null ? "contentList is null" : relatedCollectionResult2.toString());
            spz.c(TAG, sb.toString());
        } else {
            a.b bVar = (a.b) viewHolder;
            String str2 = "Page_VideoInteract_Show-CollectionPopMorePosition";
            String str3 = "Page_VideoInteract_Show-CollectionPopMoreCategory";
            if (a(relatedCollectionResult) && a(relatedCollectionResult2)) {
                List<kow> a2 = a(viewHolder, relatedCollectionResult2, bVar.f12695a, fluidContext, popupDialog, false, "Page_VideoInteract_Button-CollectionPopMorePosition");
                bVar.c.setText("更多" + str + "相关合集");
                bVar.d.setVisibility(0);
                bVar.b.setVisibility(0);
                List<kow> a3 = a(viewHolder, relatedCollectionResult, bVar.b, fluidContext, popupDialog, false, "Page_VideoInteract_Button-CollectionPopMoreCategoryPosition");
                com.taobao.android.fluid.business.usertrack.track.b.c(null, "Page_VideoInteract_Show-CollectionPopMore", null);
                com.taobao.android.fluid.business.usertrack.track.b.c(null, str3, null);
                a(bVar.f12695a, a3, str2);
                a(bVar.b, a2, "Page_VideoInteract_Show-CollectionPopMoreCategoryPosition");
                r12 = 0;
            } else if (a(relatedCollectionResult) || a(relatedCollectionResult2)) {
                r12 = 0;
                List<kow> a4 = a(viewHolder, a(relatedCollectionResult) ? relatedCollectionResult : relatedCollectionResult2, bVar.f12695a, fluidContext, popupDialog, true, "Page_VideoInteract_Button-CollectionPopMorePosition");
                bVar.c.setText("更多" + str + "相关合集");
                bVar.d.setVisibility(8);
                bVar.b.setVisibility(8);
                if (a(relatedCollectionResult2)) {
                    str3 = "Page_VideoInteract_Show-CollectionPopMore";
                }
                com.taobao.android.fluid.business.usertrack.track.b.c(null, str3, null);
                RecyclerView recyclerView = bVar.f12695a;
                if (!a(relatedCollectionResult2)) {
                    str2 = "Page_VideoInteract_Show-CollectionPopMoreCategoryPosition";
                }
                a(recyclerView, a4, str2);
            } else {
                r12 = 0;
            }
            com.taobao.android.fluid.business.usertrack.track.b.c(r12, "Page_VideoInteract_Show-CollectionPopRelatedFilmTab", r12);
        }
    }

    public static boolean a(RelatedCollectionResult relatedCollectionResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fcfc995", new Object[]{relatedCollectionResult})).booleanValue() : (relatedCollectionResult == null || relatedCollectionResult.result == null || relatedCollectionResult.result.size() <= 0) ? false : true;
    }

    private static List<kow> a(final RecyclerView.ViewHolder viewHolder, RelatedCollectionResult relatedCollectionResult, RecyclerView recyclerView, FluidContext fluidContext, PopupDialog popupDialog, boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("648b6142", new Object[]{viewHolder, relatedCollectionResult, recyclerView, fluidContext, popupDialog, new Boolean(z), str});
        }
        if (recyclerView.getAdapter() != null) {
            return ((kov) recyclerView.getAdapter()).a();
        }
        if (z) {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            recyclerView.addItemDecoration(new kou(3, (int) ((viewHolder.itemView.getContext().getResources().getDisplayMetrics().widthPixels * 0.08d) / 4.0d), true));
        } else {
            recyclerView.setPadding(ohd.b(viewHolder.itemView.getContext(), 6), 0, 0, 0);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new kou(relatedCollectionResult.result.size(), ohd.b(viewHolder.itemView.getContext(), 3), true));
        }
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < relatedCollectionResult.result.size(); i++) {
            a(arrayList, relatedCollectionResult.result.get(i));
        }
        kov kovVar = new kov(arrayList);
        kovVar.a(z);
        recyclerView.setAdapter(kovVar);
        kovVar.a(new kov.a.InterfaceC1146a() { // from class: tb.kox.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kov.a.InterfaceC1146a
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                Nav.from(viewHolder.itemView.getContext()).toUri(((kow) arrayList.get(i2)).d());
                HashMap hashMap = new HashMap();
                hashMap.put(kox.X_COLLECTION_ID, ((kow) arrayList.get(i2)).a());
                hashMap.put(kox.X_OBJECT_ID, ((kow) arrayList.get(i2)).c());
                hashMap.put(kox.X_COLLECTION_TYPE, ((kow) arrayList.get(i2)).b());
                com.taobao.android.fluid.business.usertrack.track.b.c(null, str, hashMap);
            }
        });
        return arrayList;
    }

    private static void a(List<kow> list, RelatedCollectionResult.RelatedCollectionResultItem relatedCollectionResultItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57b30cd", new Object[]{list, relatedCollectionResultItem});
        } else if (relatedCollectionResultItem == null) {
        } else {
            if (relatedCollectionResultItem.collection != null && relatedCollectionResultItem.collection.count != null) {
                str = "全" + relatedCollectionResultItem.collection.count + "集";
            } else if (relatedCollectionResultItem.collection == null || relatedCollectionResultItem.collection.updateTo == null) {
                str = " ";
            } else {
                str = "更新至" + relatedCollectionResultItem.collection.updateTo + "集";
            }
            list.add(new kow(relatedCollectionResultItem.collection.collectionName, str, relatedCollectionResultItem.content.collectionCoverUrl, a(relatedCollectionResultItem), relatedCollectionResultItem.content.collectionId, relatedCollectionResultItem.collection.collectionType, relatedCollectionResultItem.content.id));
        }
    }

    private static String a(RelatedCollectionResult.RelatedCollectionResultItem relatedCollectionResultItem) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49d9e644", new Object[]{relatedCollectionResultItem});
        }
        JSONObject parseObject = JSON.parseObject(relatedCollectionResultItem.collection.extra);
        return (parseObject == null || (string = parseObject.getString("targetUrl")) == null) ? relatedCollectionResultItem.content.targetUrl : string;
    }

    public static void a(final RecyclerView recyclerView, final List<kow> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce163c91", new Object[]{recyclerView, list, str});
        } else {
            recyclerView.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: tb.kox.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
                public void onChildViewDetachedFromWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a66017d", new Object[]{this, view});
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
                public void onChildViewAttachedToWindow(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("517542da", new Object[]{this, view});
                        return;
                    }
                    int childAdapterPosition = RecyclerView.this.getChildAdapterPosition(view);
                    HashMap hashMap = new HashMap();
                    if (childAdapterPosition < 0 || childAdapterPosition >= list.size()) {
                        return;
                    }
                    hashMap.put(kox.X_COLLECTION_ID, ((kow) list.get(childAdapterPosition)).a());
                    hashMap.put(kox.X_OBJECT_ID, ((kow) list.get(childAdapterPosition)).c());
                    hashMap.put(kox.X_COLLECTION_TYPE, ((kow) list.get(childAdapterPosition)).b());
                    com.taobao.android.fluid.business.usertrack.track.b.c(null, str, hashMap);
                }
            });
        }
    }

    public static void a(final String str, String str2, String str3, final a aVar, final FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346afe3e", new Object[]{str, str2, str3, aVar, fluidContext});
        } else if (!a(str3)) {
        } else {
            RelatedCollectionRequest relatedCollectionRequest = new RelatedCollectionRequest();
            relatedCollectionRequest.setApiName(relatedCollectionRequest.getApi());
            relatedCollectionRequest.setNeedEcode(false);
            relatedCollectionRequest.setNeedSession(false);
            relatedCollectionRequest.setVersion(relatedCollectionRequest.getVersion());
            JSONObject jSONObject = new JSONObject();
            relatedCollectionRequest.setEntityId("100772");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PopupDialog.COLLECTION_ID, (Object) str2);
            jSONObject2.put("recommendType", (Object) str);
            relatedCollectionRequest.setParams(jSONObject2.toJSONString());
            FluidSDK.getMTopAdapter().send(c.a.a().a(jSONObject).a(relatedCollectionRequest).a(new IMTopAdapter.b() { // from class: tb.kox.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
                public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5b39cfcd", new Object[]{this, mtopResponse, baseOutDo});
                    } else if (mtopResponse == null || mtopResponse.getDataJsonObject() == null) {
                    } else {
                        RelatedCollectionResult relatedCollectionResult = (RelatedCollectionResult) JSON.toJavaObject((JSONObject) JSONObject.parse(mtopResponse.getDataJsonObject().toString()), RelatedCollectionResult.class);
                        if (StringUtils.equals(str, "type")) {
                            aVar.b(relatedCollectionResult);
                            aVar.b(true);
                        }
                        if (StringUtils.equals(str, "content")) {
                            aVar.a(relatedCollectionResult);
                            aVar.a(true);
                        }
                        if (!aVar.b() || !aVar.a()) {
                            return;
                        }
                        aVar.notifyDataSetChanged();
                    }
                }

                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    spz.c(kox.TAG, "collectLinearLayout.setOnClickListener onError" + mtopResponse.toString());
                    FluidException.throwException(fluidContext, ICollectionService.INSTANCE_REQUEST_ERROR);
                }
            }).a((IMTopAdapter.a) null).b(true).a(MediaMixContentDetailResponse.class).b());
        }
    }
}
