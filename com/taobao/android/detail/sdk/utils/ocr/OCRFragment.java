package com.taobao.android.detail.sdk.utils.ocr;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.basic.d;
import com.taobao.android.detail.sdk.event.basic.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.c;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eva;
import tb.ews;
import tb.ewt;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class OCRFragment extends DialogFragment implements j<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_PIC_URL = "pic_url";
    public static final int STATUS_OCR_FAILURE = 3;
    public static final int STATUS_OCR_ING = 1;
    public static final int STATUS_OCR_SUCCESS = 2;
    private static final String TAG = "MyLog-OCRFragment";
    private Button mCloseBtn;
    private ScrollView mContentScrollview;
    private EditText mContentText;
    private Button mCopyBtn;
    private ewt mOCRCallBack;
    private b mOCRManager;
    private String mPicUrl = "";
    private Button mRetryBtn;
    private int mStatus;
    private TextView mTitleText;

    static {
        kge.a(-392099041);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(OCRFragment oCRFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1002290867) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityCreated((Bundle) objArr[0]);
            return null;
        }
    }

    private String replaceNullToEmptyStr(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c45366f5", new Object[]{this, str}) : str == null ? "" : str;
    }

    public static /* synthetic */ EditText access$000(OCRFragment oCRFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("c8899da", new Object[]{oCRFragment}) : oCRFragment.mContentText;
    }

    public static /* synthetic */ void access$100(OCRFragment oCRFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3602a954", new Object[]{oCRFragment, str});
        } else {
            oCRFragment.copyToClipboard(str);
        }
    }

    public static /* synthetic */ TextView access$200(OCRFragment oCRFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce0636dd", new Object[]{oCRFragment}) : oCRFragment.mTitleText;
    }

    public static /* synthetic */ b access$300(OCRFragment oCRFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f9d0b686", new Object[]{oCRFragment}) : oCRFragment.mOCRManager;
    }

    public static /* synthetic */ b access$302(OCRFragment oCRFragment, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("81d8eb46", new Object[]{oCRFragment, bVar});
        }
        oCRFragment.mOCRManager = bVar;
        return bVar;
    }

    public static /* synthetic */ void access$400(OCRFragment oCRFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6509027", new Object[]{oCRFragment});
        } else {
            oCRFragment.initOCRCallBack();
        }
    }

    public static void startOCRFragment(FragmentActivity fragmentActivity, DialogFragment dialogFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6947e0ae", new Object[]{fragmentActivity, dialogFragment, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putCharSequence(KEY_PIC_URL, str2);
            dialogFragment.setArguments(bundle);
            if (TextUtils.isEmpty(str)) {
                str = dialogFragment.getTag();
            }
            dialogFragment.show(fragmentActivity.getSupportFragmentManager(), str);
        } catch (IllegalStateException e) {
            eva.a(e);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        getDialog().getWindow().requestFeature(1);
        super.onActivityCreated(bundle);
        registerSubcriber();
        initStyle();
        tpc.a("com.taobao.android.detail.sdk.utils.ocr.OCRFragment");
    }

    private void initStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
            return;
        }
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.alpha = 1.0f;
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        initOCRFields(getActivity());
        View initViews = initViews(layoutInflater, viewGroup, bundle);
        this.mPicUrl = getArguments().getCharSequence(KEY_PIC_URL).toString();
        if (!TextUtils.isEmpty(this.mPicUrl)) {
            String str = "取得图片URL: " + this.mPicUrl;
        } else {
            dismiss();
        }
        updateStyleAndTrigerEvents(1, "文本正在识别中...", "请稍微等待");
        return initViews;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unRegisterSubcriber();
        super.onDestroy();
    }

    private View initViews(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ca25d0da", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.detail_ocr_dialog, viewGroup);
        this.mTitleText = (TextView) inflate.findViewById(R.id.text_ocr_title);
        this.mContentText = (EditText) inflate.findViewById(R.id.text_ocr_content);
        this.mContentScrollview = (ScrollView) inflate.findViewById(R.id.sv_ocr_content);
        this.mRetryBtn = (Button) inflate.findViewById(R.id.btn_retry);
        this.mCopyBtn = (Button) inflate.findViewById(R.id.btn_copy);
        this.mCloseBtn = (Button) inflate.findViewById(R.id.btn_close);
        this.mRetryBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    OCRFragment.this.updateStyleAndTrigerEvents(1, "文本正在识别中...", "请稍微等待");
                }
            }
        });
        this.mCopyBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (OCRFragment.access$000(OCRFragment.this) == null) {
                } else {
                    OCRFragment oCRFragment = OCRFragment.this;
                    OCRFragment.access$100(oCRFragment, OCRFragment.access$000(oCRFragment).getText().toString());
                }
            }
        });
        this.mCloseBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    OCRFragment.this.dismiss();
                }
            }
        });
        return inflate;
    }

    public void updateStyleAndTrigerEvents(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedb915f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        this.mTitleText.setText(replaceNullToEmptyStr(str));
        this.mContentText.setText(replaceNullToEmptyStr(str2));
        if (i == 1) {
            this.mRetryBtn.setVisibility(8);
            this.mCopyBtn.setVisibility(8);
            this.mCloseBtn.setVisibility(0);
            if (this.mOCRManager != null && !TextUtils.isEmpty(this.mPicUrl)) {
                this.mOCRManager.a(new String[]{this.mPicUrl});
            }
        } else if (i == 2) {
            this.mRetryBtn.setVisibility(8);
            this.mCopyBtn.setVisibility(0);
            this.mCloseBtn.setVisibility(0);
            a.a(getActivity()).interrupt();
            TextView textView = this.mTitleText;
            textView.setContentDescription(replaceNullToEmptyStr(str) + ",移动焦点可查看结果");
        } else if (i == 3) {
            this.mRetryBtn.setVisibility(0);
            this.mCopyBtn.setVisibility(8);
            this.mCloseBtn.setVisibility(0);
        }
        this.mTitleText.postDelayed(new Runnable() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                OCRFragment.access$200(OCRFragment.this).requestFocus();
                OCRFragment.access$200(OCRFragment.this).sendAccessibilityEvent(8);
            }
        }, 800L);
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("54f59b76", new Object[]{this, eVar});
        }
        if (eVar.f10222a) {
            updateStyleAndTrigerEvents(2, "识别完成", this.mOCRManager.a(this.mPicUrl, ""));
        } else {
            updateStyleAndTrigerEvents(3, "识别失败", "请稍后再试");
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void initOCRFields(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab843a", new Object[]{this, context});
        } else if (context == null) {
        } else {
            f.a(context, new d(), new c<i>() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.c
                public void onEventException(j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                    }
                }

                @Override // com.taobao.android.trade.event.c
                public void a(i iVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2d27b9", new Object[]{this, iVar, jVar});
                    } else if (jVar == null || !(jVar instanceof ews)) {
                    } else {
                        OCRFragment.access$302(OCRFragment.this, ((ews) jVar).a());
                        OCRFragment.access$400(OCRFragment.this);
                    }
                }
            });
        }
    }

    private void initOCRCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7432f7a", new Object[]{this});
            return;
        }
        this.mOCRCallBack = new ewt() { // from class: com.taobao.android.detail.sdk.utils.ocr.OCRFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ewt
            public void a(HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
                } else {
                    f.a(OCRFragment.this.getActivity(), new e(OCRFragment.access$300(OCRFragment.this), true));
                }
            }

            @Override // tb.ewt
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else {
                    f.a(OCRFragment.this.getActivity(), new e(OCRFragment.access$300(OCRFragment.this), false));
                }
            }
        };
        b bVar = this.mOCRManager;
        if (bVar == null) {
            return;
        }
        bVar.a(this.mOCRCallBack);
    }

    private void copyToClipboard(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5750b7", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ((ClipboardManager) getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("ocr", str));
            Toast.makeText(getActivity(), " 复制成功", 1).show();
        }
    }

    private void registerSubcriber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be61c6d9", new Object[]{this});
        } else {
            f.a(getActivity()).a(27001, this);
        }
    }

    private void unRegisterSubcriber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16451c0", new Object[]{this});
        } else {
            f.a(getActivity()).a(27000);
        }
    }
}
