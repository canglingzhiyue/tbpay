package com.taobao.android.detail.core.detail.kit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.rights.RightListModel;
import com.taobao.android.detail.core.request.rights.RightListRequestClient;
import com.taobao.android.detail.core.request.rights.RightListRequestParams;
import com.taobao.android.detail.datasdk.model.datamodel.node.RightsNode;
import com.taobao.android.detail.datasdk.protocol.adapter.core.ILimitAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.ILimitRefreshListener;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.enu;
import tb.epj;
import tb.its;
import tb.kge;

/* loaded from: classes4.dex */
public class RightListFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_SERVICE_IDS = "serviceIds";
    private RightListRequestClient client;
    private com.taobao.android.trade.boost.request.mtop.a<RightListModel> modelMtopRequestListener;
    private RightListAdapter rightListAdapter;
    private ArrayList<RightListModel.RightItemModel> rightModelList;
    private String serviceIds;

    static {
        kge.a(827011869);
    }

    public static /* synthetic */ Object ipc$super(RightListFragment rightListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ ArrayList access$000(RightListFragment rightListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d8f3b0c3", new Object[]{rightListFragment}) : rightListFragment.rightModelList;
    }

    public static /* synthetic */ ArrayList access$002(RightListFragment rightListFragment, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a755d7f9", new Object[]{rightListFragment, arrayList});
        }
        rightListFragment.rightModelList = arrayList;
        return arrayList;
    }

    public static /* synthetic */ void access$100(RightListFragment rightListFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cdd62a", new Object[]{rightListFragment, new Boolean(z)});
        } else {
            rightListFragment.update(z);
        }
    }

    public RightListFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.RightListFragment");
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8cd8fe", new Object[]{fragmentActivity, str, str2});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, str2));
        }
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, ArrayList<RightsNode.b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60a2df6", new Object[]{fragmentActivity, str, arrayList});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || arrayList == null || arrayList.isEmpty()) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, arrayList));
        }
    }

    public static RightListFragment newInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightListFragment) ipChange.ipc$dispatch("592e0518", new Object[]{str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        bundle.putString(EXTRA_SERVICE_IDS, str2);
        RightListFragment rightListFragment = new RightListFragment();
        rightListFragment.setArguments(bundle);
        return rightListFragment;
    }

    public static RightListFragment newInstance(String str, ArrayList<RightsNode.b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightListFragment) ipChange.ipc$dispatch("948ec6c4", new Object[]{str, arrayList});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        RightListFragment rightListFragment = new RightListFragment();
        rightListFragment.setRightModelList(arrayList);
        rightListFragment.setArguments(bundle);
        return rightListFragment;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.serviceIds = arguments.getString(EXTRA_SERVICE_IDS, "");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (StringUtils.isEmpty(this.serviceIds)) {
            update(true);
            return;
        }
        queryData();
        this.tvTitle.setVisibility(8);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        RightListRequestClient rightListRequestClient = this.client;
        if (rightListRequestClient == null) {
            return;
        }
        rightListRequestClient.cancel();
    }

    private void update(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc9c04", new Object[]{this, new Boolean(z)});
            return;
        }
        dismissLoading();
        RightListAdapter rightListAdapter = this.rightListAdapter;
        if (rightListAdapter == null) {
            this.rightListAdapter = new RightListAdapter();
            this.lvData.setAdapter((ListAdapter) this.rightListAdapter);
        } else {
            rightListAdapter.notifyDataSetChanged();
        }
        this.lvData.setDivider(null);
        this.lvData.setDividerHeight(0);
        ArrayList<RightListModel.RightItemModel> arrayList = this.rightModelList;
        if (arrayList != null && !arrayList.isEmpty()) {
            dismissLoading();
        } else if (z) {
            showEmptyView();
        } else {
            showErrorView();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
            return;
        }
        showLoading();
        RightListRequestParams rightListRequestParams = new RightListRequestParams(this.serviceIds);
        if (this.modelMtopRequestListener == null) {
            this.modelMtopRequestListener = new com.taobao.android.trade.boost.request.mtop.a<RightListModel>() { // from class: com.taobao.android.detail.core.detail.kit.fragment.RightListFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.boost.request.mtop.c
                public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                    } else {
                        a(mtopResponse);
                    }
                }

                @Override // com.taobao.android.trade.boost.request.mtop.c
                public /* synthetic */ void onSuccess(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    } else {
                        a((RightListModel) obj);
                    }
                }

                @Override // com.taobao.android.trade.boost.request.mtop.a
                public void onSystemFailure(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    } else {
                        a(mtopResponse);
                    }
                }

                public void a(RightListModel rightListModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("af49bab5", new Object[]{this, rightListModel});
                    } else if (rightListModel == null || rightListModel.result == null) {
                        a((MtopResponse) null);
                    } else {
                        if (RightListFragment.access$000(RightListFragment.this) == null) {
                            RightListFragment.access$002(RightListFragment.this, new ArrayList());
                        }
                        Iterator<RightListModel.ServiceItemModel> it = rightListModel.result.iterator();
                        while (it.hasNext()) {
                            RightListModel.ServiceItemModel next = it.next();
                            RightListModel.RightItemModel rightItemModel = new RightListModel.RightItemModel();
                            rightItemModel.id = next.id;
                            rightItemModel.description = next.description;
                            rightItemModel.name = next.name;
                            rightItemModel.icon = next.icon;
                            rightItemModel.link = next.link;
                            rightItemModel.type = 1;
                            RightListFragment.access$000(RightListFragment.this).add(rightItemModel);
                            RightListFragment.access$000(RightListFragment.this).addAll(next.services);
                        }
                        RightListFragment.access$100(RightListFragment.this, true);
                    }
                }

                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    RightListFragment.access$100(RightListFragment.this, false);
                    ILimitAdapter d = epj.d();
                    if (!its.TRAFFIC_LIMIT_STATUS.equals(mtopResponse.getRetCode()) || d == null) {
                        return;
                    }
                    d.showLimitTip(RightListFragment.this.context, new ILimitRefreshListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.RightListFragment.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.ILimitRefreshListener
                        public void refresh() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ad3d31e2", new Object[]{this});
                            } else {
                                RightListFragment.this.queryData();
                            }
                        }
                    });
                }
            };
        }
        if (this.client == null) {
            this.client = new RightListRequestClient();
        }
        this.client.execute(rightListRequestParams, this.modelMtopRequestListener, epj.a().getTTID());
    }

    private void setRightModelList(ArrayList<RightsNode.b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb263676", new Object[]{this, arrayList});
        } else if (arrayList == null) {
        } else {
            this.rightModelList = new ArrayList<>();
            Iterator<RightsNode.b> it = arrayList.iterator();
            while (it.hasNext()) {
                RightsNode.b next = it.next();
                RightListModel.RightItemModel rightItemModel = new RightListModel.RightItemModel();
                rightItemModel.name = next.b;
                rightItemModel.showType = next.d;
                if (!StringUtils.isEmpty(next.c)) {
                    rightItemModel.desc = new ArrayList<>(1);
                    rightItemModel.desc.add(next.c);
                }
                this.rightModelList.add(rightItemModel);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class RightListAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int TYPE_COUNT = 2;
        private static final int TYPE_NORMAL = 0;
        private static final int TYPE_TITLE = 1;

        static {
            kge.a(1772634076);
        }

        public static /* synthetic */ Object ipc$super(RightListAdapter rightListAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
            }
            return 2;
        }

        public RightListAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (RightListFragment.access$000(RightListFragment.this) != null) {
                return RightListFragment.access$000(RightListFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            if (RightListFragment.access$000(RightListFragment.this) != null && RightListFragment.access$000(RightListFragment.this).size() > 0 && RightListFragment.access$000(RightListFragment.this).get(i) != null) {
                return ((RightListModel.RightItemModel) RightListFragment.access$000(RightListFragment.this).get(i)).type;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : RightListFragment.access$000(RightListFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            int itemViewType = getItemViewType(i);
            a aVar2 = null;
            if (view == null) {
                if (itemViewType == 1) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_protection_title_item, (ViewGroup) null);
                    aVar = new a();
                    aVar.f9524a = view.findViewById(R.id.services_title_root);
                    aVar.b = (DetailImageView) view.findViewById(R.id.services_title_logo);
                    aVar.d = (TextView) view.findViewById(R.id.service_title_more);
                    aVar.c = (TextView) view.findViewById(R.id.services_title_name);
                    aVar.e = (TextView) view.findViewById(R.id.service_title_icon_font);
                    view.setTag(aVar);
                    aVar2 = aVar;
                    bVar = null;
                } else {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_protection_item, (ViewGroup) null);
                    bVar = new b();
                    bVar.f9525a = (DetailImageView) view.findViewById(R.id.service_icon);
                    bVar.c = (TextView) view.findViewById(R.id.service_desc);
                    bVar.b = (TextView) view.findViewById(R.id.service_name);
                    bVar.d = (TextView) view.findViewById(R.id.service_icon_font);
                    view.setTag(bVar);
                }
            } else if (itemViewType == 1) {
                aVar = (a) view.getTag();
                aVar2 = aVar;
                bVar = null;
            } else {
                bVar = (b) view.getTag();
            }
            bindData(i, viewGroup.getContext(), bVar);
            bindTitleData(i, aVar2);
            return view;
        }

        private void bindTitleData(final int i, a aVar) {
            RightListModel.RightItemModel rightItemModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bece1ec", new Object[]{this, new Integer(i), aVar});
            } else if (aVar == null || (rightItemModel = (RightListModel.RightItemModel) RightListFragment.access$000(RightListFragment.this).get(i)) == null) {
            } else {
                if (!StringUtils.isEmpty(rightItemModel.link)) {
                    aVar.d.setVisibility(0);
                    aVar.e.setVisibility(0);
                } else {
                    aVar.d.setVisibility(8);
                    aVar.e.setVisibility(8);
                }
                if (!StringUtils.isEmpty(rightItemModel.icon)) {
                    epj.b().a(rightItemModel.icon, aVar.b);
                    aVar.c.setVisibility(8);
                    aVar.b.setVisibility(0);
                } else if (!StringUtils.isEmpty(rightItemModel.name)) {
                    aVar.c.setText(rightItemModel.name);
                    aVar.c.setVisibility(0);
                    aVar.b.setVisibility(8);
                }
                if (rightItemModel == null || StringUtils.isEmpty(rightItemModel.link)) {
                    return;
                }
                aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.RightListFragment.RightListAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        String str = ((RightListModel.RightItemModel) RightListFragment.access$000(RightListFragment.this).get(i)).link;
                        if (StringUtils.isEmpty(str)) {
                            return;
                        }
                        f.a(RightListFragment.this.context, new enu(str));
                    }
                });
            }
        }

        private void bindData(int i, Context context, b bVar) {
            RightListModel.RightItemModel rightItemModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a183567", new Object[]{this, new Integer(i), context, bVar});
            } else if (bVar == null || (rightItemModel = (RightListModel.RightItemModel) RightListFragment.access$000(RightListFragment.this).get(i)) == null) {
            } else {
                bVar.b.setText(rightItemModel.name);
                if (rightItemModel.desc != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = rightItemModel.desc.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                    }
                    bVar.c.setText(sb.toString());
                } else {
                    bVar.c.setText("");
                }
                if (StringUtils.isEmpty(rightItemModel.icon)) {
                    bVar.d.setVisibility(0);
                    bVar.f9525a.setVisibility(8);
                    if (rightItemModel.showType == 0) {
                        bVar.d.setText(context.getString(R.string.taodetail_iconfont_round_check));
                        return;
                    } else {
                        bVar.d.setText(context.getString(R.string.taodetail_iconfont_info));
                        return;
                    }
                }
                bVar.d.setVisibility(8);
                bVar.f9525a.setVisibility(0);
                epj.b().a(rightItemModel.icon, bVar.f9525a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public DetailImageView f9525a;
        public TextView b;
        public TextView c;
        public TextView d;

        static {
            kge.a(-908768072);
        }

        private b() {
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public View f9524a;
        public DetailImageView b;
        public TextView c;
        public TextView d;
        public TextView e;

        static {
            kge.a(328063362);
        }

        private a() {
        }
    }
}
