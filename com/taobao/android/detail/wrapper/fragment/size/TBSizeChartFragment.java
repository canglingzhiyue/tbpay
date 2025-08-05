package com.taobao.android.detail.wrapper.fragment.size;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.sdk.request.size.TBEditSizeClient;
import com.taobao.android.detail.wrapper.activity.SizeChartActivity;
import com.taobao.android.detail.wrapper.ext.component.main.view.size.RateInfoView;
import com.taobao.android.detail.wrapper.ext.component.main.view.size.RecommendSizeChartView;
import com.taobao.android.detail.wrapper.ext.component.main.view.size.RoleSizeChartView;
import com.taobao.android.detail.wrapper.ext.component.main.view.size.SizeIllustrationView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.c;
import com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartModel;
import com.taobao.android.detail.wrapper.request.size.model.RoleSize;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dzh;
import tb.eeg;
import tb.emu;
import tb.epo;
import tb.epq;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSizeChartFragment extends DialogFragment implements View.OnClickListener, a<MtopResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBSizeChartFragment";
    public String itemId;
    private boolean mEditMode;
    private boolean mLoading;
    private RateInfoView mRateInfoView;
    private RecommendSizeChartView mRecommendSizeChartView;
    private RoleSizeChartView mRoleSizeChartView;
    private TBSizeChartModel mSizeChartModel;
    private SizeIllustrationView mSizeIllustrationView;
    private TextView mTvBack;
    private TextView mTvEdit;
    private TextView mTvTitle;
    private View mViewLoading;
    public String msoaToken;
    public String sellerId;
    public String userId;

    static {
        kge.a(1744748265);
        kge.a(-1201612728);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(TBSizeChartFragment tBSizeChartFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(TBSizeChartFragment tBSizeChartFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("157f9ea5", new Object[]{tBSizeChartFragment})).booleanValue() : tBSizeChartFragment.mEditMode;
    }

    public static /* synthetic */ RoleSizeChartView access$100(TBSizeChartFragment tBSizeChartFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoleSizeChartView) ipChange.ipc$dispatch("7a170fac", new Object[]{tBSizeChartFragment}) : tBSizeChartFragment.mRoleSizeChartView;
    }

    public static /* synthetic */ void access$200(TBSizeChartFragment tBSizeChartFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c11e555", new Object[]{tBSizeChartFragment, new Boolean(z)});
        } else {
            tBSizeChartFragment.switchEditMode(z);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setStyle(0, 16973840);
        emu.a("com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.x_detail_size_chart_fragment, viewGroup, false);
        this.mTvBack = (TextView) inflate.findViewById(R.id.tv_size_chart_actionbar_back);
        this.mTvTitle = (TextView) inflate.findViewById(R.id.tv_size_chart_actionbar_title);
        this.mTvEdit = (TextView) inflate.findViewById(R.id.tv_size_chart_actionbar_edit);
        this.mViewLoading = inflate.findViewById(R.id.progress_detail_size);
        this.mTvBack.setOnClickListener(this);
        this.mRoleSizeChartView = (RoleSizeChartView) inflate.findViewById(R.id.v_my_size_chart);
        this.mRecommendSizeChartView = (RecommendSizeChartView) inflate.findViewById(R.id.v_recommend_size_chart);
        this.mRecommendSizeChartView.setActivity(getActivity());
        this.mSizeIllustrationView = (SizeIllustrationView) inflate.findViewById(R.id.v_my_size_chart_illustration);
        this.mRateInfoView = (RateInfoView) inflate.findViewById(R.id.v_my_size_chart_rate_info);
        this.mTvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (TBSizeChartFragment.access$000(TBSizeChartFragment.this)) {
                    dzh.c(TBSizeChartFragment.this.getActivity());
                } else {
                    dzh.a(TBSizeChartFragment.this.getActivity());
                }
                TBSizeChartFragment tBSizeChartFragment = TBSizeChartFragment.this;
                TBSizeChartFragment.access$200(tBSizeChartFragment, TBSizeChartFragment.access$100(tBSizeChartFragment).isModified());
            }
        });
        c.a();
        this.mRoleSizeChartView.setMeasureOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                dzh.b(TBSizeChartFragment.this.getActivity());
                Bundle bundle2 = new Bundle();
                bundle2.putString("itemId", TBSizeChartFragment.this.itemId);
                bundle2.putString("sellerId", TBSizeChartFragment.this.sellerId);
                bundle2.putString("ttid", epo.f());
                bundle2.putString("msoa_token", TBSizeChartFragment.this.msoaToken);
                epq.a(epo.a(), "https://measure.taobao.com/home.htm", bundle2);
            }
        });
        initDialogIfNeed();
        showLoading(this.mLoading);
        TBSizeChartModel tBSizeChartModel = this.mSizeChartModel;
        if (tBSizeChartModel != null) {
            fillData(tBSizeChartModel);
        }
        return inflate;
    }

    private void initDialogIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9143ef2", new Object[]{this});
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.getWindow().setWindowAnimations(R.style.tbSizeChartWindowAnim);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                return TBSizeChartFragment.this.goBack();
            }
        });
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public void initNodeBundle(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280d8e14", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.itemId = cVar.i();
            this.sellerId = cVar.h();
            this.msoaToken = cVar.n();
        }
    }

    public void initDataFromNewSku(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a8bc50", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.userId = str;
        this.itemId = str2;
        this.sellerId = str3;
        this.msoaToken = str4;
    }

    public void fillData(TBSizeChartModel tBSizeChartModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4b12ba", new Object[]{this, tBSizeChartModel});
        } else if (tBSizeChartModel == null) {
        } else {
            this.mSizeChartModel = tBSizeChartModel;
            if (getActivity() == null) {
                return;
            }
            this.mRoleSizeChartView.fillData(tBSizeChartModel.roleSize);
            this.mRateInfoView.fillData(tBSizeChartModel.rateInfo);
            this.mRecommendSizeChartView.fillData(tBSizeChartModel.sizeChart);
            this.mSizeIllustrationView.setImageLoaderDecor(f.a(getActivity()));
            this.mSizeIllustrationView.fillData(tBSizeChartModel.sizeChart);
        }
    }

    public boolean goBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156bc6fa", new Object[]{this})).booleanValue();
        }
        if (this.mEditMode) {
            switchEditMode(false);
            return true;
        }
        if (getActivity() instanceof SizeChartActivity) {
            getActivity().finish();
        } else {
            com.taobao.android.trade.event.f.a(getActivity(), new eeg());
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            goBack();
        }
    }

    public void showLoading(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed9df0e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mLoading = z;
        View view = this.mViewLoading;
        if (view == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void fillData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d458b0", new Object[]{this, obj});
        } else if (obj == null || !(obj instanceof TBSizeChartModel)) {
        } else {
            fillData((TBSizeChartModel) obj);
        }
    }

    private void saveSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e92d4a5", new Object[]{this});
            return;
        }
        HashMap<String, String> writableData = this.mRoleSizeChartView.getWritableData();
        RoleSize roleSize = this.mSizeChartModel.roleSize;
        new TBEditSizeClient().execute(new com.taobao.android.detail.sdk.request.size.a(epo.g().e(), "" + roleSize.roleId, "" + roleSize.sizeType, writableData), this, epo.f());
        showLoading(true);
    }

    private void switchEditMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af8bdac", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.mEditMode) {
            this.mEditMode = true;
            this.mRoleSizeChartView.switchMode(true);
        } else if (z) {
            saveSize();
        } else {
            this.mEditMode = false;
            this.mRoleSizeChartView.switchMode(false);
        }
        String str = "编辑尺码";
        this.mTvEdit.setText(this.mEditMode ? "保存" : str);
        this.mTvBack.setText(this.mEditMode ? ILocalizationService.CANCEL : getString(R.string.taodetail_iconfont_back));
        TextView textView = this.mTvTitle;
        if (!this.mEditMode) {
            str = "尺码";
        }
        textView.setText(str);
        int i = 8;
        this.mRecommendSizeChartView.setVisibility(this.mEditMode ? 8 : 0);
        RateInfoView rateInfoView = this.mRateInfoView;
        if (!this.mEditMode) {
            i = 0;
        }
        rateInfoView.setVisibility(i);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public void onSuccess(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e364b0", new Object[]{this, mtopResponse});
            return;
        }
        showLoading(false);
        if (mtopResponse.isApiSuccess()) {
            epo.a("保存成功");
            switchEditMode(false);
            if (getActivity() instanceof SizeChartActivity) {
                ((SizeChartActivity) getActivity()).a(true);
                ((SizeChartActivity) getActivity()).a();
                return;
            }
            com.taobao.android.trade.event.f.a(getActivity(), new p());
            return;
        }
        handleSaveError(mtopResponse);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
            return;
        }
        showLoading(false);
        handleSaveError(mtopResponse);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            onFailure(mtopResponse);
        }
    }

    private void handleSaveError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8ab98f", new Object[]{this, mtopResponse});
            return;
        }
        epo.a(mtopResponse.isNetworkError() ? "网络异常,暂时无法保存" : "服务器异常,暂时无法保存");
        switchEditMode(false);
    }
}
