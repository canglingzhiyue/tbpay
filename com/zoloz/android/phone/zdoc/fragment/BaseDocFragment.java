package com.zoloz.android.phone.zdoc.fragment;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import com.zoloz.android.phone.zdoc.module.CollModule;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import com.zoloz.android.phone.zdoc.ui.IMessageView;
import com.zoloz.android.phone.zdoc.ui.UIState;
import java.util.HashMap;
import tb.kge;
import tb.rrj;
import tb.rrk;
import tb.rrl;
import tb.rrm;
import tb.rrq;
import tb.rrr;
import tb.rrt;
import tb.rru;
import tb.rrv;
import zoloz.ap.com.toolkit.ui.TitleBar;

/* loaded from: classes9.dex */
public class BaseDocFragment extends BaseCameraPermissionFragment implements rrl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ZdocCaptureActivity";
    public BioAppDescription mBioAppDescription;
    public BioUploadService mBioUploadService;
    public String mBisToken;
    public rrm mCameraInterface;
    public CameraSurfaceView mCameraSurfaceView;
    public byte[] mContent;
    public int mCurrentPageNumber;
    public int mCurrentPageNumberIndex;
    public int mCurrentRetryTimes;
    public BaseMaskView mDefaultMaskView;
    public zoloz.ap.com.toolkit.ui.a mDialogHelper;
    public String mDocType;
    public boolean mIsUTF8;
    public byte[] mKey;
    public int mMaxRetryTimes;
    public IMessageView mMessageView;
    public ImageView mPhotoImageView;
    public com.zoloz.android.phone.zdoc.utils.a mRecordManager;
    public TitleBar mTitleBar;
    public int mUiType;
    public com.zoloz.android.phone.zdoc.upload.a mUploadManager;
    public ZdocRemoteConfig mZdocRemoteConfig;
    private Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    public boolean mShowFrame = false;
    public UIState mCurrentState = UIState.CAPTURE;
    public boolean needRecordImageSize = true;
    public TGFrame currTgFrame = null;

    static {
        kge.a(-1285539699);
        kge.a(329653214);
    }

    public static /* synthetic */ Object ipc$super(BaseDocFragment baseDocFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // tb.rrl
    public void onSurfaceDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931706f2", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(BaseDocFragment baseDocFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af624a87", new Object[]{baseDocFragment, str});
        } else {
            baseDocFragment.handleNetWorkError(str);
        }
    }

    public static /* synthetic */ void access$100(BaseDocFragment baseDocFragment, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470fd69f", new Object[]{baseDocFragment, bioUploadResult});
        } else {
            baseDocFragment.handleFailRetry(bioUploadResult);
        }
    }

    public static /* synthetic */ void access$200(BaseDocFragment baseDocFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bea53b", new Object[]{baseDocFragment});
        } else {
            baseDocFragment.interrupt();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
            getActivity().finish();
            return;
        }
        initData();
        initUpload();
        this.mCurrentPageNumberIndex = 0;
        this.mRecordManager = new com.zoloz.android.phone.zdoc.utils.a();
        formatConfigs();
    }

    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mBioAppDescription = (BioAppDescription) getArguments().getSerializable(ALBiometricsActivityParentView.p);
        this.mZdocRemoteConfig = (ZdocRemoteConfig) getArguments().getSerializable("config");
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription == null || this.mZdocRemoteConfig == null) {
            return;
        }
        this.mBisToken = bioAppDescription.getBistoken();
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue() : com.zoloz.android.phone.zdoc.ui.a.a(getActivity(), this.mUiType, this.mDocType, this.mCurrentPageNumber);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void alertSystemError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9559024", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar == null || aVar.d()) {
            return;
        }
        this.mRecordManager.a(rrv.SYSTEM_EXCEPTION_ERROR);
        this.mDialogHelper.a(getString(R.string.system_error_title), getString(R.string.system_error_msg), getString(R.string.system_error_got_it), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                BaseDocFragment.this.mRecordManager.a(rrv.SYSTEM_EXCEPTION_ERROR, Integer.toString(1));
                dialogInterface.dismiss();
                BaseDocFragment.this.responseWithCode(205, null);
            }
        }, null, null);
    }

    public Rect mappingToPic(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("998fab3a", new Object[]{this, rect});
        }
        int g = CameraSurfaceView.getCameraImpl(getActivity()).g();
        int f = CameraSurfaceView.getCameraImpl(getActivity()).f();
        if (g >= f) {
            f = g;
            g = f;
        }
        int height = this.mCameraSurfaceView.getHeight();
        int width = this.mCameraSurfaceView.getWidth();
        int width2 = (width - this.mDefaultMaskView.getWidth()) / 2;
        int height2 = (height - this.mDefaultMaskView.getHeight()) / 2;
        Rect rect2 = new Rect(rect.left + width2, rect.top + height2, rect.right + width2, rect.bottom + height2);
        float f2 = g / width;
        BioLog.i("mappingToPic leftx =" + rect2.left + "rightX =" + rect2.right + "leftY =" + rect2.top + "rightY =" + rect2.bottom + "imagewidth =" + g + "imageheight =" + f + "screenwidth =" + width + "screenheight =" + height + "ratioH =" + f2);
        rect2.left = (int) (((float) rect2.left) * f2);
        float f3 = (((float) f) - (((float) height) * f2)) / 2.0f;
        rect2.top = (int) ((((float) rect2.top) * f2) + f3);
        rect2.right = (int) (((float) rect2.right) * f2);
        rect2.bottom = (int) ((f2 * ((float) rect2.bottom)) + f3);
        BioLog.i("mappingToPic leftx =" + rect2.left + "rightX =" + rect2.right + "leftY =" + rect2.top + "rightY =" + rect2.bottom + "imagewidth =" + g + "imageheight =" + f + "screenwidth =" + width + "screenheight =" + height);
        return rect2;
    }

    public void formatConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a42901", new Object[]{this});
            return;
        }
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig == null) {
            return;
        }
        CollModule coll = zdocRemoteConfig.getModules().get(this.mCurrentPageNumberIndex).getColl();
        this.mUiType = coll.getUiType();
        this.mDocType = coll.getDocType();
        this.mCurrentPageNumber = coll.getPageNo();
        this.mCurrentRetryTimes = 0;
        this.mMaxRetryTimes = coll.getRetryLimit();
        this.mRecordManager.a(this.mCurrentPageNumber);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        interrupt();
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCurrentPageNumberIndex = 0;
        this.mCurrentPageNumber = 0;
        this.mCurrentRetryTimes = 0;
        this.mContent = null;
        this.mKey = null;
        IMessageView iMessageView = this.mMessageView;
        if (iMessageView != null) {
            iMessageView.clearClickListener();
        }
        TitleBar titleBar = this.mTitleBar;
        if (titleBar != null) {
            titleBar.setClickListener(null);
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar != null) {
            aVar.b();
            this.mDialogHelper.c();
            this.mDialogHelper = null;
        }
        rrm rrmVar = this.mCameraInterface;
        if (rrmVar != null) {
            rrmVar.a();
        }
        if (this.mUploadManager != null) {
            this.mUploadManager = null;
        }
        this.mBioUploadService = null;
        super.onDestroy();
    }

    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else if (!z || getActivity() == null || getActivity().isFinishing()) {
        } else {
            this.mMessageView.setUiLocation(this.mUiType, this.mDocType, this.mCurrentPageNumber, this.mCameraSurfaceView.getHeight(), this.mDefaultMaskView.getTipsBottomMargin(), this.mDefaultMaskView.getInvisibleHeight());
        }
    }

    @Override // tb.rrl
    public void onSurfaceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a0fcc1", new Object[]{this});
        } else {
            this.mRecordManager.b(1);
        }
    }

    @Override // tb.rrl
    public void onSurfaceChanged(final double d, final double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641eb30d", new Object[]{this, new Double(d), new Double(d2)});
        } else {
            this.mMainThreadHandler.post(new Runnable() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseDocFragment.this.adjustPreview(d, d2);
                    }
                }
            });
        }
    }

    @Override // tb.rrl
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
            this.mCameraSurfaceView.setVisibility(4);
            checkCameraPermission();
        } else if (i == 0) {
        } else {
            this.mCameraSurfaceView.setVisibility(4);
            alertSystemError();
        }
    }

    @Override // tb.rrl
    public void onPreviewFrame(rrj rrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd72d91", new Object[]{this, rrjVar});
            return;
        }
        if (this.mShowFrame) {
            final TGFrame tGFrame = this.currTgFrame;
            if (tGFrame == null) {
                tGFrame = createTGFrame(rrjVar);
            }
            runOnUiThread(new Runnable() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseDocFragment.this.showPreviewImg(tGFrame);
                    }
                }
            });
            this.mShowFrame = false;
        }
        BioLog.i("recordImageSize " + rrjVar.b() + " " + rrjVar.c());
        if (!this.needRecordImageSize) {
            return;
        }
        this.mRecordManager.a(rrjVar.b(), rrjVar.c());
        this.needRecordImageSize = false;
    }

    public void adjustPreview(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7e6d00", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = cameraSurfaceView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.mPhotoImageView.getLayoutParams();
        int width = this.mCameraSurfaceView.getWidth();
        int height = this.mCameraSurfaceView.getHeight();
        int i = (int) ((width / d) * d2);
        if (i >= height) {
            layoutParams.height = i;
            layoutParams2.height = i;
        } else {
            int i2 = (int) ((height / d2) * d);
            if (i2 >= width) {
                layoutParams.width = i2;
                layoutParams2.width = i2;
            }
        }
        this.mCameraSurfaceView.setLayoutParams(layoutParams);
        this.mPhotoImageView.setLayoutParams(layoutParams2);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void alertCameraNoPermissionDialog(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45e5a8a", new Object[]{this, aVar});
            return;
        }
        com.zoloz.android.phone.zdoc.utils.a aVar2 = this.mRecordManager;
        if (aVar2 != null) {
            aVar2.b(0);
        }
        if (this.mDialogHelper == null) {
            this.mDialogHelper = new zoloz.ap.com.toolkit.ui.a(getActivity());
        }
        this.mDialogHelper.a(getString(R.string.zdoc_camera_permission_title), getString(R.string.zdoc_camera_permission_msg), getString(R.string.zdoc_camera_permission_settings), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    aVar.execute();
                }
            }
        }, getString(R.string.zdoc_camera_permission_not_allow), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.CAMERA_ERROR, Integer.toString(1));
                BaseDocFragment.this.responseWithCode(100, null);
            }
        });
    }

    private void initUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2804d738", new Object[]{this});
        } else if (this.mBioAppDescription == null || this.mZdocRemoteConfig == null) {
        } else {
            this.mUploadManager = new com.zoloz.android.phone.zdoc.upload.a(getActivity(), this.mBioAppDescription, this.mZdocRemoteConfig);
            this.mUploadManager.c();
            if (BioServiceManager.getCurrentInstance() == null) {
                BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
                getActivity().finish();
                return;
            }
            this.mBioUploadService = (BioUploadService) BioServiceManager.getCurrentInstance().getBioService(BioUploadService.class);
            this.mBioUploadService.clearUp();
            this.mBioUploadService.addCallBack(new BioUploadCallBack() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.security.bio.service.BioUploadCallBack
                public boolean onResponse(final BioUploadResult bioUploadResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("97c3fce", new Object[]{this, bioUploadResult})).booleanValue();
                    }
                    if (bioUploadResult.validationRetCode == 2006) {
                        bioUploadResult.productRetCode = 2001;
                    }
                    BaseDocFragment.this.mRecordManager.a();
                    int i = bioUploadResult.productRetCode;
                    if (i == 1001) {
                        BaseDocFragment.this.mRecordManager.a(1, 1, 1001);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_SUCCESS);
                        new Handler().postDelayed(new Runnable() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.13.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (BaseDocFragment.this.mDialogHelper != null) {
                                    BaseDocFragment.this.mDialogHelper.a();
                                }
                                BaseDocFragment.this.responseWithCode(500, bioUploadResult);
                            }
                        }, 800L);
                    } else if (i == 1002) {
                        BaseDocFragment.this.handleSuccContinue();
                    } else if (i == 2001) {
                        BaseDocFragment.this.mRecordManager.a(1, 0, bioUploadResult.productRetCode);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                        BaseDocFragment.this.failQuit(bioUploadResult);
                    } else if (i == 2002) {
                        BaseDocFragment.access$100(BaseDocFragment.this, bioUploadResult);
                    } else if (i == 3001 || i == 3002) {
                        BaseDocFragment.access$000(BaseDocFragment.this, bioUploadResult.subMsg);
                    } else {
                        BaseDocFragment.this.mRecordManager.a(1, 0, bioUploadResult.productRetCode);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                        BaseDocFragment.this.updateUI(UIState.ALERT);
                        BaseDocFragment.this.alertSystemError();
                    }
                    return false;
                }
            });
        }
    }

    private void handleFailRetry(BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba85566c", new Object[]{this, bioUploadResult});
        } else if (bioUploadResult.extParams == null) {
        } else {
            HashMap hashMap = new HashMap(bioUploadResult.extParams);
            this.mRecordManager.a(1, 0, 2002);
            updateUI(UIState.UPLOAD_END_FAIL);
            this.mRecordManager.c();
            this.mRecordManager.a(rrv.SERVER_QUALITY_ERROR);
            zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
            if (aVar == null || aVar.d()) {
                return;
            }
            updateUI(UIState.ALERT);
            if (this.mCurrentRetryTimes < this.mMaxRetryTimes) {
                String string = getString(R.string.zdoc_unknow_title);
                String string2 = getString(R.string.zdoc_unknow_msg);
                try {
                    String str = (String) JSON.parseObject((String) hashMap.get("clientExtInfo")).get("detectCode");
                    if (!StringUtil.isNullorEmpty(str)) {
                        switch (str.hashCode()) {
                            case -2003602871:
                                if (str.equals("IMPERFECT")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1437569509:
                                if (str.equals("NO_FACE")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1143378681:
                                if (str.equals("EXPOSURE")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2041959:
                                if (str.equals("BLUR")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 228486029:
                                if (str.equals("WRONG_DOCUMENT")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 666915289:
                                if (str.equals("NO_DOCUMENT")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 735991061:
                                if (str.equals("EXPIRED_DOCUMENT")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                string = getString(R.string.zdoc_no_document_title);
                                string2 = getString(R.string.zdoc_no_document_msg);
                                break;
                            case 1:
                                string = getString(R.string.zdoc_imperfect_title);
                                string2 = getString(R.string.zdoc_imperfect_msg);
                                break;
                            case 2:
                                string = getString(R.string.zdoc_blur_title);
                                string2 = getString(R.string.zdoc_blur_msg);
                                break;
                            case 3:
                                string = getString(R.string.zdoc_exposure_title);
                                string2 = getString(R.string.zdoc_exposure_msg);
                                break;
                            case 4:
                                string = getString(R.string.zdoc_noface_title);
                                string2 = getString(R.string.zdoc_noface_msg);
                                break;
                            case 5:
                                string = getString(R.string.zdoc_wrong_document_title);
                                string2 = getString(R.string.zdoc_wrong_document_msg);
                                break;
                            case 6:
                                string = getString(R.string.zdoc_expired_document_title);
                                string2 = getString(R.string.zdoc_expired_document_msg);
                                break;
                        }
                    }
                } catch (Exception unused) {
                }
                this.mDialogHelper.a(string, string2, getString(R.string.zdoc_dialog_retry), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BaseDocFragment.this.mCurrentRetryTimes++;
                        dialogInterface.dismiss();
                        BaseDocFragment.this.mRecordManager.a(rrv.SERVER_QUALITY_ERROR, Integer.toString(1));
                        BaseDocFragment.this.retry();
                    }
                }, getString(R.string.zdoc_dialog_close), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        dialogInterface.dismiss();
                        BaseDocFragment.this.mRecordManager.a(rrv.SERVER_QUALITY_ERROR, Integer.toString(0));
                        BaseDocFragment.this.responseWithCode(301, null);
                    }
                });
                return;
            }
            failQuit(null);
        }
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            updateUI(UIState.CAPTURE);
        }
    }

    public void handleSuccContinue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c17358", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar != null) {
            aVar.a();
        }
        this.mCurrentRetryTimes = 0;
        this.mRecordManager.a(1, 1, 1002);
        updateUI(UIState.UPLOAD_END_SUCCESS);
        this.mCurrentPageNumberIndex++;
        if (this.mCurrentPageNumberIndex < this.mZdocRemoteConfig.getModules().size()) {
            new Handler().postDelayed(new Runnable() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BaseDocFragment.this.updateUI(UIState.CAPTURE);
                    BaseDocFragment.this.formatConfigs();
                    BioLog.i("zdoc  mToygerDocService.config");
                }
            }, 1000L);
        } else {
            this.mCurrentPageNumberIndex--;
        }
    }

    private void handleNetWorkError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621a4fb3", new Object[]{this, str});
            return;
        }
        this.mRecordManager.a(0, 0, 999);
        updateUI(UIState.UPLOAD_END_FAIL);
        this.mRecordManager.a(rrv.NETWORK_ERROR);
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar == null || aVar.d()) {
            return;
        }
        updateUI(UIState.ALERT);
        this.mDialogHelper.a(getString(R.string.network_error_title), getString(R.string.network_error_msg), getString(R.string.network_error_retry), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.NETWORK_ERROR, Integer.toString(1));
                BaseDocFragment.this.updateUI(UIState.UPLOADING);
                BaseDocFragment.this.upLoadImage();
            }
        }, getString(R.string.network_error_exit), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.NETWORK_ERROR, Integer.toString(0));
                BaseDocFragment.this.responseWithCode(207, null);
            }
        });
    }

    public void upLoadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c7b41", new Object[]{this});
            return;
        }
        byte[] bArr = this.mContent;
        if (bArr != null) {
            this.mRecordManager.a(bArr.length);
            com.zoloz.android.phone.zdoc.upload.a aVar = this.mUploadManager;
            if (aVar == null) {
                return;
            }
            aVar.a(this.mCurrentRetryTimes);
            this.mUploadManager.a(this.mContent, this.mKey, this.mIsUTF8);
            return;
        }
        alertSystemError();
    }

    public void responseWithCode(int i, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99f45ab", new Object[]{this, new Integer(i), bioUploadResult});
            return;
        }
        rrr rrrVar = new rrr();
        rrrVar.b = i;
        rrrVar.c = bioUploadResult;
        rrq.a().a(rrrVar);
    }

    public void failQuit(final BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e17d97", new Object[]{this, bioUploadResult});
            return;
        }
        this.mRecordManager.a(rrv.OVER_THRESHOLD_ERROR);
        this.mRecordManager.b();
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar == null) {
            return;
        }
        aVar.a(getString(R.string.zdoc_retry_max_title), getString(R.string.zdoc_retry_max_msg), getString(R.string.zdoc_retry_max_got_it), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.OVER_THRESHOLD_ERROR, Integer.toString(1));
                BaseDocFragment.this.responseWithCode(209, bioUploadResult);
            }
        }, null, null);
    }

    private void interrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363cc96a", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar == null || aVar.d()) {
            return;
        }
        this.mRecordManager.a(rrv.ACTIVE_EXIT);
        final UIState uIState = this.mCurrentState;
        updateUI(UIState.ALERT);
        this.mDialogHelper.a(getString(R.string.zdoc_user_cancel_title), getString(R.string.zdoc_user_cancel_msg), getString(R.string.zdoc_user_cancel_stay), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.ACTIVE_EXIT, Integer.toString(1));
                if (uIState != UIState.CAPTURE) {
                    return;
                }
                BaseDocFragment.this.updateUI(UIState.CAPTURE);
            }
        }, getString(R.string.zdoc_user_cancel_quit), new DialogInterface.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                dialogInterface.dismiss();
                BaseDocFragment.this.mRecordManager.a(rrv.ACTIVE_EXIT, Integer.toString(0));
                BaseDocFragment.this.responseWithCode(301, null);
            }
        });
    }

    public void updateUI(UIState uIState) {
        IMessageView iMessageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced99bc6", new Object[]{this, uIState});
            return;
        }
        switch (uIState) {
            case CAPTURE:
            case SCANNING:
                handleCapture();
                break;
            case SCAN_TASK_OK:
                handleScanTaskOK();
                break;
            case USER_CONFIRM:
                handleUserConfirm();
                break;
            case UPLOADING:
                handleUploading();
                break;
            case UPLOAD_END_SUCCESS:
                zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
                if (aVar != null) {
                    aVar.a(false, (DialogInterface.OnCancelListener) null);
                    break;
                }
                break;
            case UPLOAD_END_FAIL:
                zoloz.ap.com.toolkit.ui.a aVar2 = this.mDialogHelper;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
            case ALERT:
                handleAlert(this.mCurrentState);
                break;
        }
        this.mCurrentState = uIState;
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig == null || (iMessageView = this.mMessageView) == null) {
            return;
        }
        iMessageView.updateUI(uIState, zdocRemoteConfig.getShowPowerByZoloz(), -1);
    }

    private void handleScanTaskOK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1093ccd", new Object[]{this});
        } else {
            this.mShowFrame = true;
        }
    }

    public void handleUserConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c063f34", new Object[]{this});
        } else {
            this.mShowFrame = true;
        }
    }

    public void handleUploading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dcbd00", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar == null) {
            return;
        }
        aVar.a("", false, null, true);
    }

    public void handleAlert(UIState uIState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5c722f", new Object[]{this, uIState});
        } else if (uIState != UIState.CAPTURE) {
        } else {
            this.mShowFrame = true;
            this.mRecordManager.a();
        }
    }

    public void handleCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299c8985", new Object[]{this});
            return;
        }
        zoloz.ap.com.toolkit.ui.a aVar = this.mDialogHelper;
        if (aVar != null) {
            aVar.a();
        }
        this.mPhotoImageView.setVisibility(4);
        this.mCameraSurfaceView.setVisibility(0);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void onInitView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4395295b", new Object[]{this});
            return;
        }
        this.mDialogHelper = new zoloz.ap.com.toolkit.ui.a(getActivity());
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mPhotoImageView = (ImageView) findViewById(R.id.iv_photo);
        this.mTitleBar = (TitleBar) findViewById(R.id.layout_titlebar);
        this.mMessageView = (IMessageView) findViewById(R.id.layout_message);
        if (this.mZdocRemoteConfig != null) {
            this.mMessageView.updateUI(UIState.CAPTURE, this.mZdocRemoteConfig.getShowPowerByZoloz(), -1);
        }
        this.mTitleBar.setClickListener(new View.OnClickListener() { // from class: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                BaseDocFragment.this.mRecordManager.b(BaseDocFragment.this.mCurrentState.toString(), rrv.GO_BACK);
                BaseDocFragment.access$200(BaseDocFragment.this);
            }
        });
        this.mDefaultMaskView = (BaseMaskView) findViewById(R.id.layout_mask_view);
        this.mDefaultMaskView.setLayerType(1, null);
        if (this.mBioAppDescription == null || this.mZdocRemoteConfig == null) {
            alertSystemError();
        }
        hotReloadUI();
    }

    public void hotReloadUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdd2ce1", new Object[]{this});
            return;
        }
        new rru(this.mTitleBar).a();
        new rrt(this.mDefaultMaskView).a();
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void onCameraInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f680bb9b", new Object[]{this});
            return;
        }
        this.mCameraInterface = CameraSurfaceView.getCameraImpl(getActivity());
        rrm rrmVar = this.mCameraInterface;
        if (rrmVar != null) {
            rrmVar.a(this);
            this.mCameraInterface.a(getCurrentDeviceSetting());
        } else {
            alertSystemError();
        }
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView == null) {
            return;
        }
        cameraSurfaceView.setCameraCallback(this);
        this.mCameraSurfaceView.setVisibility(0);
        updateUI(UIState.CAPTURE);
    }

    public rrk getCurrentDeviceSetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrk) ipChange.ipc$dispatch("9ffadc5d", new Object[]{this});
        }
        rrk rrkVar = new rrk();
        rrkVar.a(false);
        rrkVar.a(findBackCameraId());
        return rrkVar;
    }

    private int findBackCameraId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bc469fa", new Object[]{this})).intValue();
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
        } catch (RuntimeException e) {
            BioLog.e(e);
            this.mRecordManager.b("camera not found");
        }
        return 0;
    }

    public TGFrame createTGFrame(rrj rrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TGFrame) ipChange.ipc$dispatch("7b15b617", new Object[]{this, rrjVar});
        }
        TGFrame tGFrame = new TGFrame();
        tGFrame.data = rrjVar.a().array();
        tGFrame.width = rrjVar.b();
        tGFrame.height = rrjVar.c();
        tGFrame.frameMode = 0;
        tGFrame.rotation = CameraSurfaceView.getCameraImpl(getContext()).e() % 360;
        return tGFrame;
    }

    public void showPreviewImg(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0f4e7d", new Object[]{this, tGFrame});
            return;
        }
        try {
            this.mPhotoImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap rotateBitmap = BitmapHelper.rotateBitmap(BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, tGFrame.frameMode), tGFrame.rotation);
            if (rotateBitmap == null) {
                return;
            }
            this.mPhotoImageView.setImageBitmap(BitmapHelper.resize(rotateBitmap, (int) (rotateBitmap.getWidth() * 0.8f), (int) (rotateBitmap.getHeight() * 0.8f)));
            this.mPhotoImageView.setVisibility(0);
        } catch (OutOfMemoryError unused) {
            this.mRecordManager.b("zdoc_out_of_memory");
            System.gc();
        }
    }
}
