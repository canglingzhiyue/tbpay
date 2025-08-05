package com.taobao.android.detail.core.detail.kit.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.jhs.marketing.JhsMarkegingResult;
import com.taobao.android.detail.core.request.jhs.marketing.JhsMarketingRequestClient;
import com.taobao.android.detail.core.request.jhs.marketing.JhsMarketingRequestParams;
import com.taobao.android.detail.core.request.jhs.marketingaction.JhsMarkegingActionResult;
import com.taobao.android.detail.core.request.jhs.marketingaction.JhsMarketingActionRequestClient;
import com.taobao.android.detail.core.request.jhs.marketingaction.JhsMarketingActionRequestParams;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import com.taobao.vessel.utils.b;
import java.util.ArrayList;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ado;
import tb.emu;
import tb.enu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class JhsMarketingFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_ITEM_ID = "item_id";
    private MarketingAdapter mAdapter;
    private String mItemId;
    private JhsMarketingActionRequestClient mMarketingActionReqClient;
    private com.taobao.android.trade.boost.request.mtop.a<JhsMarkegingActionResult> mMarketingActionReqListener;
    private JhsMarketingActionRequestParams mMarketingActionReqParam;
    private ArrayList<JhsMarkegingResult.JhsMarketingItem> mMarketingItems;
    private JhsMarketingRequestClient mMarketingReqClient;
    private com.taobao.android.trade.boost.request.mtop.a<JhsMarkegingResult> mMarketingReqListener;
    private JhsMarketingRequestParams mMarketingReqParams;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9520a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;

        static {
            kge.a(-1467818553);
        }

        public a() {
        }
    }

    static {
        kge.a(-91376274);
    }

    public static /* synthetic */ Object ipc$super(JhsMarketingFragment jhsMarketingFragment, String str, Object... objArr) {
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

    public static /* synthetic */ ArrayList access$000(JhsMarketingFragment jhsMarketingFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1d5d6ad6", new Object[]{jhsMarketingFragment}) : jhsMarketingFragment.mMarketingItems;
    }

    public static /* synthetic */ void access$100(JhsMarketingFragment jhsMarketingFragment, String str, String str2, JhsMarkegingResult.MarketingAction marketingAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bce24f7", new Object[]{jhsMarketingFragment, str, str2, marketingAction});
        } else {
            jhsMarketingFragment.requestMarketingAction(str, str2, marketingAction);
        }
    }

    public static /* synthetic */ MarketingAdapter access$200(JhsMarketingFragment jhsMarketingFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MarketingAdapter) ipChange.ipc$dispatch("6d36ee8c", new Object[]{jhsMarketingFragment}) : jhsMarketingFragment.mAdapter;
    }

    public JhsMarketingFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.JhsMarketingFragment");
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8cd8fe", new Object[]{fragmentActivity, str, str2});
        } else if (fragmentActivity == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            startFragment(fragmentActivity, newInstance(str, str2));
        }
    }

    public static JhsMarketingFragment newInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JhsMarketingFragment) ipChange.ipc$dispatch("e55e8df3", new Object[]{str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        bundle.putString("item_id", str2);
        JhsMarketingFragment jhsMarketingFragment = new JhsMarketingFragment();
        jhsMarketingFragment.setArguments(bundle);
        return jhsMarketingFragment;
    }

    public void update(ArrayList<JhsMarkegingResult.JhsMarketingItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c280ada", new Object[]{this, arrayList});
            return;
        }
        this.mMarketingItems = arrayList;
        dismissLoading();
        MarketingAdapter marketingAdapter = this.mAdapter;
        if (marketingAdapter == null) {
            this.mAdapter = new MarketingAdapter();
            this.lvData.setAdapter((ListAdapter) this.mAdapter);
        } else {
            marketingAdapter.notifyDataSetChanged();
        }
        ArrayList<JhsMarkegingResult.JhsMarketingItem> arrayList2 = this.mMarketingItems;
        if (arrayList2 == null) {
            showErrorView();
        } else if (arrayList2.size() == 0) {
            showEmptyView();
        } else {
            dismissLoading();
        }
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
        this.mItemId = arguments.getString("item_id", "-1");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        JhsMarketingRequestClient jhsMarketingRequestClient = this.mMarketingReqClient;
        if (jhsMarketingRequestClient != null) {
            jhsMarketingRequestClient.cancel();
        }
        JhsMarketingActionRequestClient jhsMarketingActionRequestClient = this.mMarketingActionReqClient;
        if (jhsMarketingActionRequestClient != null) {
            jhsMarketingActionRequestClient.cancel();
        }
        this.mMarketingActionReqListener = null;
        this.mMarketingReqListener = null;
        this.mMarketingItems = null;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
            return;
        }
        showLoading();
        this.mMarketingReqParams = new JhsMarketingRequestParams(this.mItemId);
        if (this.mMarketingReqListener == null) {
            this.mMarketingReqListener = new com.taobao.android.trade.boost.request.mtop.a<JhsMarkegingResult>() { // from class: com.taobao.android.detail.core.detail.kit.fragment.JhsMarketingFragment.1
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
                        a((JhsMarkegingResult) obj);
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

                public void a(JhsMarkegingResult jhsMarkegingResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d9356", new Object[]{this, jhsMarkegingResult});
                    } else if (jhsMarkegingResult != null && jhsMarkegingResult.result != null) {
                        JhsMarketingFragment.this.update(jhsMarkegingResult.result);
                    } else {
                        JhsMarketingFragment.this.update(null);
                    }
                }

                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    } else {
                        JhsMarketingFragment.this.update(null);
                    }
                }
            };
        }
        if (this.mMarketingReqClient == null) {
            this.mMarketingReqClient = new JhsMarketingRequestClient();
        }
        this.mMarketingReqClient.execute(this.mMarketingReqParams, this.mMarketingReqListener, epo.f());
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.tvClose.setText(R.string.close);
        queryData();
    }

    /* loaded from: classes4.dex */
    public class MarketingAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View.OnClickListener mBtnOnclickListener = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.JhsMarketingFragment.MarketingAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                JhsMarkegingResult.JhsMarketingItem jhsMarketingItem = (JhsMarkegingResult.JhsMarketingItem) view.getTag();
                if (jhsMarketingItem.button == null) {
                    return;
                }
                if (TextUtils.isEmpty(jhsMarketingItem.button.link)) {
                    if (jhsMarketingItem.button.action == null) {
                        return;
                    }
                    JhsMarketingFragment.access$100(JhsMarketingFragment.this, jhsMarketingItem.type, jhsMarketingItem.id, jhsMarketingItem.button.action);
                    return;
                }
                if (jhsMarketingItem.button.link.startsWith(ado.URL_SEPARATOR)) {
                    JhsMarkegingResult.MarketActivityButton marketActivityButton = jhsMarketingItem.button;
                    marketActivityButton.link = b.HTTPS_SCHEMA + jhsMarketingItem.button.link;
                }
                f.a(JhsMarketingFragment.this.getActivity(), new enu(jhsMarketingItem.button.link));
            }
        };

        static {
            kge.a(1099721439);
        }

        public static /* synthetic */ Object ipc$super(MarketingAdapter marketingAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public MarketingAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (JhsMarketingFragment.access$000(JhsMarketingFragment.this) != null) {
                return JhsMarketingFragment.access$000(JhsMarketingFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : JhsMarketingFragment.access$000(JhsMarketingFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_jhs_marketing_item, (ViewGroup) null);
                aVar = new a();
                aVar.c = (TextView) view.findViewById(R.id.detail_jhs_marketing_desc);
                aVar.f9520a = (TextView) view.findViewById(R.id.detail_jhs_marketing_type);
                aVar.b = (TextView) view.findViewById(R.id.detail_jhs_marketing_task_desc);
                aVar.d = (TextView) view.findViewById(R.id.detail_jhs_marketing_extend_desc);
                aVar.e = (TextView) view.findViewById(R.id.detail_jhs_marketing_get_btn);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            bindData(i, aVar);
            return view;
        }

        private void bindData(int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b70c0a1", new Object[]{this, new Integer(i), aVar});
                return;
            }
            JhsMarkegingResult.JhsMarketingItem jhsMarketingItem = (JhsMarkegingResult.JhsMarketingItem) JhsMarketingFragment.access$000(JhsMarketingFragment.this).get(i);
            if (jhsMarketingItem == null) {
                return;
            }
            if (!TextUtils.isEmpty(jhsMarketingItem.marketingDescForPlugin)) {
                aVar.c.setText(jhsMarketingItem.marketingDescForPlugin);
            } else {
                aVar.c.setVisibility(8);
            }
            if (!TextUtils.isEmpty(jhsMarketingItem.marketingTypeForPlugin)) {
                aVar.f9520a.setText(jhsMarketingItem.marketingTypeForPlugin);
            } else {
                aVar.f9520a.setVisibility(8);
            }
            if (!TextUtils.isEmpty(jhsMarketingItem.marketingTaskDescForPlugin)) {
                aVar.b.setText(jhsMarketingItem.marketingTaskDescForPlugin);
            } else {
                aVar.b.setVisibility(8);
            }
            if (!TextUtils.isEmpty(jhsMarketingItem.marketingExtendDescForPlugin)) {
                aVar.d.setText(jhsMarketingItem.marketingExtendDescForPlugin);
            } else {
                aVar.d.setVisibility(8);
            }
            if (jhsMarketingItem.button == null) {
                aVar.e.setVisibility(8);
                aVar.e.setOnClickListener(null);
                return;
            }
            aVar.e.setTag(jhsMarketingItem);
            if (jhsMarketingItem.button.status) {
                aVar.e.setText(jhsMarketingItem.button.msgDisplay);
                aVar.e.setBackgroundResource(R.drawable.detail_jhs_marketing_btn_bg_normal);
                aVar.e.setTextColor(Color.parseColor("#e61414"));
                aVar.e.setOnClickListener(this.mBtnOnclickListener);
                return;
            }
            aVar.e.setOnClickListener(null);
            aVar.e.setBackgroundDrawable(null);
            aVar.e.setText(jhsMarketingItem.button.msgDisplay);
            aVar.e.setTextColor(JhsMarketingFragment.this.getResources().getColor(R.color.detail_9));
        }
    }

    private void requestMarketingAction(String str, String str2, JhsMarkegingResult.MarketingAction marketingAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d76afe", new Object[]{this, str, str2, marketingAction});
            return;
        }
        this.mMarketingActionReqParam = new JhsMarketingActionRequestParams(this.mItemId, str, str2, marketingAction.attributes);
        if (this.mMarketingActionReqListener == null) {
            this.mMarketingActionReqListener = new com.taobao.android.trade.boost.request.mtop.a<JhsMarkegingActionResult>() { // from class: com.taobao.android.detail.core.detail.kit.fragment.JhsMarketingFragment.2
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
                        a((JhsMarkegingActionResult) obj);
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

                public void a(JhsMarkegingActionResult jhsMarkegingActionResult) {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("473b24b6", new Object[]{this, jhsMarkegingActionResult});
                    } else if (jhsMarkegingActionResult == null) {
                    } else {
                        while (true) {
                            if (i >= JhsMarketingFragment.access$000(JhsMarketingFragment.this).size()) {
                                break;
                            }
                            JhsMarkegingResult.JhsMarketingItem jhsMarketingItem = (JhsMarkegingResult.JhsMarketingItem) JhsMarketingFragment.access$000(JhsMarketingFragment.this).get(i);
                            if (jhsMarketingItem == null || jhsMarketingItem.button == null || TextUtils.isEmpty(jhsMarkegingActionResult.id) || !TextUtils.equals(jhsMarkegingActionResult.id, jhsMarketingItem.id)) {
                                i++;
                            } else {
                                jhsMarketingItem.button.status = jhsMarkegingActionResult.isEnabled;
                                jhsMarketingItem.button.msgDisplay = jhsMarkegingActionResult.buttonText;
                                if (JhsMarketingFragment.access$200(JhsMarketingFragment.this) != null) {
                                    JhsMarketingFragment.access$200(JhsMarketingFragment.this).notifyDataSetChanged();
                                }
                            }
                        }
                        if (TextUtils.isEmpty(jhsMarkegingActionResult.popUpText) || JhsMarketingFragment.this.getActivity() == null) {
                            return;
                        }
                        Toast.makeText(JhsMarketingFragment.this.getActivity(), jhsMarkegingActionResult.popUpText, 1).show();
                    }
                }

                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    } else if (JhsMarketingFragment.this.getActivity() == null) {
                    } else {
                        Toast.makeText(JhsMarketingFragment.this.getActivity(), JhsMarketingFragment.this.getResources().getString(R.string.detail_query_error), 1).show();
                    }
                }
            };
        }
        if (this.mMarketingActionReqClient == null) {
            this.mMarketingActionReqClient = new JhsMarketingActionRequestClient();
        }
        this.mMarketingActionReqClient.execute(this.mMarketingActionReqParam, this.mMarketingActionReqListener, epo.f());
    }
}
