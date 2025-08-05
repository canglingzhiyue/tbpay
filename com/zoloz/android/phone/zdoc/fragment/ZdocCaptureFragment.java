package com.zoloz.android.phone.zdoc.fragment;

import android.view.View;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.ToygerDocBlobConfig;
import com.ap.zlz.toyger.zdoc.d;
import com.zoloz.android.phone.zdoc.ui.UIState;
import java.util.HashMap;
import tb.kge;
import tb.rrj;
import tb.rrv;

/* loaded from: classes9.dex */
public class ZdocCaptureFragment extends BaseDocFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCaptured = false;
    private TGFrame mTGFrame;

    static {
        kge.a(259469006);
    }

    public static /* synthetic */ Object ipc$super(ZdocCaptureFragment zdocCaptureFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -833446436:
                super.initView();
                return null;
            case 563903297:
                super.upLoadImage();
                return null;
            case 698124677:
                super.handleCapture();
                return null;
            case 1003957649:
                super.onPreviewFrame((rrj) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$002(ZdocCaptureFragment zdocCaptureFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180eab3e", new Object[]{zdocCaptureFragment, new Boolean(z)})).booleanValue();
        }
        zdocCaptureFragment.isCaptured = z;
        return z;
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseFragment
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        if (!hasCameraPermission() || this.mDialogHelper == null || this.mDialogHelper.d() || this.mCurrentState != UIState.CAPTURE) {
            return;
        }
        updateUI(UIState.CAPTURE);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        super.initView();
        this.mMessageView.setOnTakePhotoListener(new View.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ZdocCaptureFragment.this.mRecordManager.b(ZdocCaptureFragment.this.mCurrentState.toString(), rrv.TAKE_PHOTO);
                ZdocCaptureFragment.access$002(ZdocCaptureFragment.this, true);
            }
        });
        this.mMessageView.setOnConfirmListener(new View.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ZdocCaptureFragment.this.mRecordManager.b(ZdocCaptureFragment.this.mCurrentState.toString(), rrv.PHOTO_CONFIRM);
                ZdocCaptureFragment.this.updateUI(UIState.UPLOADING);
                ZdocCaptureFragment.this.upLoadImage();
            }
        });
        this.mMessageView.setOnReTakePhotoListener(new View.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ZdocCaptureFragment.this.mRecordManager.b(ZdocCaptureFragment.this.mCurrentState.toString(), rrv.PHOTO_CANCEL);
                ZdocCaptureFragment.this.updateUI(UIState.CAPTURE);
            }
        });
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment, tb.rrl
    public void onPreviewFrame(rrj rrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd72d91", new Object[]{this, rrjVar});
            return;
        }
        super.onPreviewFrame(rrjVar);
        if (!this.isCaptured) {
            return;
        }
        this.mTGFrame = createTGFrame(rrjVar);
        this.isCaptured = false;
        updateUI(UIState.USER_CONFIRM);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment
    public void upLoadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c7b41", new Object[]{this});
            return;
        }
        if (this.mTGFrame != null) {
            ToygerDocBlobConfig toygerDocBlobConfig = new ToygerDocBlobConfig();
            toygerDocBlobConfig.ratio = this.mZdocRemoteConfig.getRatio();
            toygerDocBlobConfig.pageNo = this.mCurrentPageNumber;
            toygerDocBlobConfig.pubkey = this.mUploadManager.a();
            record(rrv.ZTECH_ENTER);
            toygerDocBlobConfig.docType = this.mZdocRemoteConfig.getModules().get(Math.min(this.mCurrentPageNumberIndex, this.mZdocRemoteConfig.getModules().size() - 1)).getColl().getDocType();
            HashMap<String, Object> a2 = d.a(this.mTGFrame, toygerDocBlobConfig, mappingToPic(this.mDefaultMaskView.getDocFrame()), 1, this.mBisToken, String.valueOf(this.mCurrentRetryTimes));
            this.mContent = (byte[]) a2.get("content");
            this.mKey = (byte[]) a2.get("key");
            this.mIsUTF8 = ((Boolean) a2.get(ToygerBaseService.KEY_RES_9_IS_UTF8)).booleanValue();
        }
        super.upLoadImage();
    }

    private void record(String str) {
        rrv rrvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa2422", new Object[]{this, str});
            return;
        }
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance == null || (rrvVar = (rrv) currentInstance.getBioService(rrv.class)) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", "toyger");
        rrvVar.a(str, hashMap);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment
    public void handleCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299c8985", new Object[]{this});
            return;
        }
        super.handleCapture();
        this.isCaptured = false;
        this.mPhotoImageView.setVisibility(8);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTGFrame = null;
    }
}
