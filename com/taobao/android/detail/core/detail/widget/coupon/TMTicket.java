package com.taobao.android.detail.core.detail.widget.coupon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.emu;
import tb.epm;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class TMTicket extends ViewGroup implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COUPONTYPE_MX = 15;
    public static final String TAG = "TMTicket";
    public static final int TYPE_COUPON = 0;
    public static final int TYPE_DOUBLE_11 = 3;
    public static final int TYPE_DOUBLE_11_2017 = 4;
    public static final int TYPE_DOUBLE_11_NEW = 2;
    public static final int TYPE_RED_BONUS = 1;
    public int CAT_H;
    public int CAT_W;
    public int PADDING_2017;
    public int PADDING_TOP_TEXT;
    public int TEXT_H;
    public int TEXT_MIN_W;
    public int TEXT_W;
    private int applyTextColor;
    private int countTextColor;
    private int couponType;
    private List<String> desInfoList;
    private String double11TextIconUrl;
    private boolean hasBottom;
    private boolean hasPit;
    private boolean hasRightFilter;
    private String leftBgUrl;
    private TextView leftFirstTextView;
    private String leftMoneyIconUrl;
    private TextView leftSecondTextView;
    private Path linePath;
    private int mBgColor;
    private int mBottomBgColor;
    private TextView mBottomButton;
    private float mBottomHeight;
    private String mBottomJumpUrl;
    private int mBottomPadding;
    private Path mBottomPath;
    private int mBottomTextColor;
    private TextView mBottomTextView;
    private c mClickListener;
    private Bitmap mCornerBitmap;
    private Context mCtx;
    private int mDashLineColor;
    private PathEffect mDashLineEffects;
    private int mDashLinePaddingLeft;
    private int mDashLinePaddingRight;
    private Path mDashLinePath;
    private float mDensity;
    private int mDisabledTextColor;
    private String mImgCachedDir;
    private List<TextView> mLeftDescViews;
    private List<TextView> mLeftIconViews;
    private DetailIconFontTextView mLeftPrefTitleView;
    private DetailImageView mLeftTitleSuffixImageView;
    private TextView mLeftTitleView;
    private float mLineX;
    private int mMarginRightTitleSubTitle;
    private int mMarginTitleDesc;
    private Paint mPaint;
    private Path mPath;
    private float mPointRadius;
    private float mRedius;
    private boolean mRightCanClick;
    private View mRightClickView;
    private Path mRightFilter;
    private int mRightFilterColor;
    private TextView mRightSubTitleView;
    private TextView mRightTitleView;
    private int mTextColor;
    private int mType;
    private Bitmap mWatermark;
    private String mWatermarkUrl;
    private Bitmap mapBGBitmap;
    private Bitmap moneyBitmap;
    private Rect moneyImgRect;
    private Bitmap rightBGBitmap;
    private String rightBgUrl;
    private TextView rightFirstTextView;
    private TextView rightSecondTextView;
    private String rightText1;
    private String rightText2;
    private String rightText3;
    private TextView rightThirdTextView;
    private Bitmap textBitmap;
    private Rect textImgRect;

    /* loaded from: classes4.dex */
    public interface b {
        void a(Bitmap bitmap);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(TMTicket tMTicket);

        void b(TMTicket tMTicket);
    }

    static {
        kge.a(1741605628);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(TMTicket tMTicket, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ Bitmap access$002(TMTicket tMTicket, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d6e23e0", new Object[]{tMTicket, bitmap});
        }
        tMTicket.mapBGBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$102(TMTicket tMTicket, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("56852a7f", new Object[]{tMTicket, bitmap});
        }
        tMTicket.rightBGBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$202(TMTicket tMTicket, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9f9c311e", new Object[]{tMTicket, bitmap});
        }
        tMTicket.moneyBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$302(TMTicket tMTicket, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e8b337bd", new Object[]{tMTicket, bitmap});
        }
        tMTicket.textBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ String access$400(TMTicket tMTicket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29987732", new Object[]{tMTicket}) : tMTicket.mImgCachedDir;
    }

    public static /* synthetic */ String access$500(TMTicket tMTicket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f39b9d1", new Object[]{tMTicket}) : tMTicket.mWatermarkUrl;
    }

    public static /* synthetic */ float access$600(TMTicket tMTicket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5591e20", new Object[]{tMTicket})).floatValue() : tMTicket.mDensity;
    }

    public static /* synthetic */ int access$700(BitmapFactory.Options options, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("312836da", new Object[]{options, new Integer(i)})).intValue() : simpleSize(options, i);
    }

    public static /* synthetic */ Bitmap access$802(TMTicket tMTicket, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("562658d8", new Object[]{tMTicket, bitmap});
        }
        tMTicket.mWatermark = bitmap;
        return bitmap;
    }

    public static /* synthetic */ Bitmap access$900(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("7192f8f0", new Object[]{bitmap, new Float(f)}) : scaleBitmap(bitmap, f);
    }

    public TMTicket(Context context) {
        super(context);
        this.hasPit = true;
        this.hasRightFilter = false;
        this.mRightFilterColor = 436207616;
        this.mRightFilter = null;
        this.hasBottom = false;
        this.mBottomHeight = 0.0f;
        this.mDisabledTextColor = 1694498815;
        this.mBottomTextColor = -40610;
        this.mTextColor = -1;
        this.mRightCanClick = true;
        this.mType = 0;
        this.mClickListener = null;
        this.mImgCachedDir = null;
        this.desInfoList = new ArrayList();
        this.CAT_W = epo.b(88);
        this.CAT_H = epo.b(92);
        this.TEXT_MIN_W = epo.b(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        this.PADDING_2017 = epo.b(6);
        this.TEXT_W = epo.b(115);
        this.TEXT_H = epo.b(18);
        this.PADDING_TOP_TEXT = epo.b(21);
        init();
    }

    public TMTicket(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hasPit = true;
        this.hasRightFilter = false;
        this.mRightFilterColor = 436207616;
        this.mRightFilter = null;
        this.hasBottom = false;
        this.mBottomHeight = 0.0f;
        this.mDisabledTextColor = 1694498815;
        this.mBottomTextColor = -40610;
        this.mTextColor = -1;
        this.mRightCanClick = true;
        this.mType = 0;
        this.mClickListener = null;
        this.mImgCachedDir = null;
        this.desInfoList = new ArrayList();
        this.CAT_W = epo.b(88);
        this.CAT_H = epo.b(92);
        this.TEXT_MIN_W = epo.b(SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR);
        this.PADDING_2017 = epo.b(6);
        this.TEXT_W = epo.b(115);
        this.TEXT_H = epo.b(18);
        this.PADDING_TOP_TEXT = epo.b(21);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundColor(16777216);
        this.mDensity = getResources().getDisplayMetrics().density;
        float f = this.mDensity;
        this.mRedius = f * 5.0f;
        this.mPointRadius = f * 5.0f;
        this.mPaint = new Paint();
        float f2 = this.mDensity;
        this.mDashLineEffects = new DashPathEffect(new float[]{3.0f * f2, f2 * 2.0f}, 1.0f);
        this.mBgColor = -898229;
        this.mDashLineColor = -1;
        this.mPaint.setStrokeWidth(this.mDensity * 1.0f);
        this.mPaint.setAntiAlias(true);
        this.mBottomBgColor = -6940;
        float f3 = this.mDensity;
        this.mDashLinePaddingLeft = (int) (f3 * 10.0f);
        this.mDashLinePaddingRight = (int) (10.0f * f3);
        this.mBottomPadding = (int) (f3 * 12.0f);
        this.mMarginTitleDesc = (int) (12.0f * f3);
        this.mMarginRightTitleSubTitle = (int) (f3 * 5.0f);
        this.mCtx = getContext();
        this.mImgCachedDir = getContext().getCacheDir().getPath();
        emu.a("com.taobao.android.detail.core.detail.widget.coupon.TMTicket");
    }

    public void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
        } else {
            this.mBgColor = i;
        }
    }

    public void setOnTicketClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6166c02a", new Object[]{this, cVar});
        } else {
            this.mClickListener = cVar;
        }
    }

    public void hasMiddlePit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b7861", new Object[]{this, new Boolean(z)});
        } else {
            this.hasPit = z;
        }
    }

    public void hasRightFilter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce037db3", new Object[]{this, new Boolean(z)});
        } else {
            this.hasRightFilter = z;
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.mTextColor = i;
        }
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.mTextColor;
    }

    public void setBottomTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baeb6d73", new Object[]{this, new Integer(i)});
        } else {
            this.mBottomTextColor = i;
        }
    }

    public void setDashColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367a80d", new Object[]{this, new Integer(i)});
        } else {
            this.mDashLineColor = i;
        }
    }

    public void setBottomBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32c75cb", new Object[]{this, new Integer(i)});
        } else {
            this.mBottomBgColor = i;
        }
    }

    public void setWatermarkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6558c2be", new Object[]{this, str});
        } else if (this.mType == 4) {
            this.leftBgUrl = str;
        } else {
            this.mWatermarkUrl = str;
        }
    }

    public void setBottomJumpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86dd805", new Object[]{this, str});
        } else {
            this.mBottomJumpUrl = str;
        }
    }

    public String getBottomJumpUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f1728f9", new Object[]{this}) : this.mBottomJumpUrl;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.mClickListener == null) {
        } else {
            if (view == this.mRightTitleView || view == this.mRightSubTitleView || view == this.mRightClickView) {
                if (!this.mRightCanClick) {
                    return;
                }
                this.mClickListener.b(this);
            } else if (view != this.mBottomTextView && view != this.mBottomButton) {
            } else {
                this.mClickListener.a(this);
            }
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.mType = i;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mType;
    }

    public void setLeftPrefTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73899297", new Object[]{this, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            if (this.mLeftPrefTitleView == null) {
                this.mLeftPrefTitleView = new DetailIconFontTextView(getContext());
                this.mLeftPrefTitleView.setSingleLine();
                this.mLeftPrefTitleView.setTextSize(1, 14.0f);
                this.mLeftPrefTitleView.setTextColor(this.mTextColor);
                this.mLeftPrefTitleView.getPaint().setFakeBoldText(true);
                this.mLeftPrefTitleView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                addView(this.mLeftPrefTitleView);
            }
            this.mLeftPrefTitleView.setText(charSequence);
        }
    }

    public void setLeftTitle(CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75683a49", new Object[]{this, charSequence, new Integer(i)});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            if (this.mLeftTitleView == null) {
                this.mLeftTitleView = new TextView(getContext());
                this.mLeftTitleView.setSingleLine();
                this.mLeftTitleView.setEllipsize(StringUtils.TruncateAt.END);
                this.mLeftTitleView.setTextSize(1, i);
                this.mLeftTitleView.setTextColor(this.mTextColor);
                this.mLeftTitleView.getPaint().setFakeBoldText(true);
                this.mLeftTitleView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                addView(this.mLeftTitleView);
                if (i == 30) {
                    setPadding(getPaddingLeft(), getPaddingTop() - ((int) (this.mDensity * 3.0f)), getPaddingRight(), getPaddingBottom());
                    this.mMarginTitleDesc -= (int) (this.mDensity * 3.0f);
                }
            }
            this.mLeftTitleView.setText(charSequence);
        }
    }

    public void setleftTitleSuffixImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1407cec", new Object[]{this, str});
        } else if (this.mType == 4) {
            this.double11TextIconUrl = str;
        } else if (StringUtils.isEmpty(str)) {
        } else {
            int i = 19;
            if (this.couponType == 15) {
                i = 13;
            }
            if (this.mLeftTitleSuffixImageView == null) {
                this.mLeftTitleSuffixImageView = new DetailImageView(getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, (int) (i * this.mDensity));
                int i2 = (int) (this.mDensity * 5.0f);
                marginLayoutParams.rightMargin = i2;
                marginLayoutParams.leftMargin = i2;
                this.mLeftTitleSuffixImageView.setLayoutParams(marginLayoutParams);
                this.mLeftTitleSuffixImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.mLeftTitleSuffixImageView.setAdjustViewBounds(true);
                addView(this.mLeftTitleSuffixImageView);
            }
            epm epmVar = new epm();
            epmVar.c = true;
            epmVar.b = (int) (i * this.mDensity);
            f.a(getContext()).a(this.mLeftTitleSuffixImageView, str, epmVar);
        }
    }

    public void setLeftIcon(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ace921a", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            List<TextView> list2 = this.mLeftIconViews;
            if (list2 == null) {
                this.mLeftIconViews = new ArrayList();
            } else {
                for (TextView textView : list2) {
                    removeView(textView);
                }
                this.mLeftIconViews.clear();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = (int) (this.mDensity * 6.0f);
            for (int i = 0; i < list.size(); i++) {
                TextView textView2 = new TextView(getContext());
                textView2.setTextSize(1, 10.0f);
                textView2.setSingleLine();
                textView2.setEllipsize(StringUtils.TruncateAt.END);
                textView2.setTextColor(this.mTextColor);
                textView2.setLayoutParams(marginLayoutParams);
                float f = this.mDensity;
                textView2.setPadding((int) (f * 2.0f), 0, (int) (f * 2.0f), 0);
                textView2.setBackgroundResource(R.drawable.detail_coupon_info);
                this.mLeftIconViews.add(textView2);
                textView2.setText(list.get(i));
                addView(textView2);
            }
        }
    }

    public void setLeftDesc(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ae5832", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            if (this.mType == 4) {
                this.desInfoList.clear();
                this.desInfoList.addAll(list);
                return;
            }
            List<TextView> list2 = this.mLeftDescViews;
            if (list2 == null) {
                this.mLeftDescViews = new ArrayList();
            } else {
                for (TextView textView : list2) {
                    removeView(textView);
                }
                this.mLeftDescViews.clear();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(0, (int) (this.mDensity * 0.5d), 0, 0);
            for (int i = 0; i < list.size(); i++) {
                TextView textView2 = new TextView(getContext());
                if (this.couponType == 15) {
                    textView2.setTextSize(1, 10.0f);
                } else {
                    textView2.setTextSize(1, 11.0f);
                }
                textView2.setTextColor(this.mTextColor);
                textView2.setLayoutParams(marginLayoutParams);
                this.mLeftDescViews.add(textView2);
                textView2.setText(list.get(i));
                addView(textView2);
            }
        }
    }

    public void setRightTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e7192b", new Object[]{this, charSequence, new Boolean(z)});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            if (this.mType == 4) {
                setRightText12(charSequence, z);
                return;
            }
            if (this.mRightTitleView == null) {
                this.mRightTitleView = new DetailIconFontTextView(getContext());
                this.mRightTitleView.setGravity(17);
                this.mRightTitleView.setMaxLines(2);
                this.mRightTitleView.setEllipsize(StringUtils.TruncateAt.END);
                if (z) {
                    TextView textView = this.mRightTitleView;
                    int i = this.applyTextColor;
                    if (i == 0) {
                        i = this.mTextColor;
                    }
                    textView.setTextColor(i);
                    this.mRightTitleView.setAlpha(1.0f);
                } else {
                    this.mRightTitleView.setTextColor(this.mDisabledTextColor);
                }
                if (this.couponType == 15) {
                    this.mRightTitleView.setTextSize(1, 14.0f);
                    this.mRightTitleView.getPaint().setFakeBoldText(true);
                } else {
                    this.mRightTitleView.setTextSize(1, 14.0f);
                }
                this.mRightTitleView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                this.mRightTitleView.setOnClickListener(this);
                addView(this.mRightTitleView);
            }
            this.mRightCanClick = z;
            this.mRightTitleView.setText(charSequence);
            addRightClickView();
        }
    }

    private void addRightClickView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88e7019", new Object[]{this});
        } else if (this.mRightClickView != null) {
        } else {
            this.mRightClickView = new View(getContext());
            this.mRightClickView.setOnClickListener(this);
            addView(this.mRightClickView);
        }
    }

    public void setRightTitleSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe0e1fd", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRightTitleView;
        if (textView == null) {
            return;
        }
        textView.setTextSize(1, i);
    }

    public void setRightSubTitleSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5537bf29", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mRightSubTitleView;
        if (textView == null) {
            return;
        }
        textView.setTextSize(1, i);
    }

    public void setMarginRightTitleSubTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d71df58", new Object[]{this, new Integer(i)});
        } else {
            this.mMarginRightTitleSubTitle = (int) (i * this.mDensity);
        }
    }

    public void setRightSubTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e77a857", new Object[]{this, charSequence, new Boolean(z)});
        } else if (charSequence == null) {
        } else {
            if (this.mType == 4) {
                setRightText3(charSequence);
                return;
            }
            if (this.mRightSubTitleView == null) {
                this.mRightSubTitleView = new TextView(getContext());
                this.mRightSubTitleView.setGravity(17);
                this.mRightSubTitleView.setSingleLine();
                this.mRightSubTitleView.setEllipsize(StringUtils.TruncateAt.END);
                if (z) {
                    TextView textView = this.mRightSubTitleView;
                    int i = this.countTextColor;
                    if (i == 0) {
                        i = this.mTextColor;
                    }
                    textView.setTextColor(i);
                    this.mRightSubTitleView.setAlpha(1.0f);
                } else {
                    this.mRightSubTitleView.setTextColor(this.mDisabledTextColor);
                }
                if (this.couponType == 15) {
                    this.mRightSubTitleView.setTextSize(1, 10.0f);
                } else {
                    this.mRightSubTitleView.setTextSize(1, 11.0f);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.topMargin = (int) (this.mDensity * 6.0f);
                this.mRightSubTitleView.setLayoutParams(marginLayoutParams);
                this.mRightSubTitleView.setOnClickListener(this);
                addView(this.mRightSubTitleView);
            }
            this.mRightSubTitleView.setText(charSequence);
            addRightClickView();
        }
    }

    public void setBottomText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddbf525", new Object[]{this, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            this.hasBottom = true;
            if (this.mBottomTextView == null) {
                this.mBottomTextView = new TextView(getContext());
                this.mBottomTextView.setSingleLine();
                this.mBottomTextView.setEllipsize(StringUtils.TruncateAt.END);
                this.mBottomTextView.setTextColor(this.mBottomTextColor);
                this.mBottomTextView.setTextSize(1, 12.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                float f = this.mDensity;
                marginLayoutParams.topMargin = (int) (f * 7.0f);
                marginLayoutParams.bottomMargin = (int) (f * 7.0f);
                this.mBottomTextView.setLayoutParams(marginLayoutParams);
                this.mBottomTextView.setOnClickListener(this);
                addView(this.mBottomTextView);
            }
            this.mBottomTextView.setText(charSequence);
        }
    }

    public void setBottomButton(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd52e6a", new Object[]{this, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
        } else {
            this.hasBottom = true;
            if (this.mBottomButton == null) {
                this.mBottomButton = new DetailIconFontTextView(getContext());
                this.mBottomButton.setGravity(5);
                this.mBottomButton.setSingleLine();
                this.mBottomButton.setEllipsize(StringUtils.TruncateAt.END);
                this.mBottomButton.setTextColor(this.mBottomTextColor);
                this.mBottomButton.setTextSize(1, 12.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                float f = this.mDensity;
                marginLayoutParams.topMargin = (int) (f * 7.0f);
                marginLayoutParams.bottomMargin = (int) (7.0f * f);
                marginLayoutParams.leftMargin = (int) (f * 6.0f);
                this.mBottomButton.setLayoutParams(marginLayoutParams);
                this.mBottomButton.setOnClickListener(this);
                addView(this.mBottomButton);
            }
            this.mBottomButton.setText(charSequence);
        }
    }

    public void updateDisenabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf4af23", new Object[]{this});
            return;
        }
        this.mRightCanClick = false;
        if (this.mType == 4) {
        }
    }

    public void setCouponType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4420e21a", new Object[]{this, new Integer(i)});
        } else {
            this.couponType = i;
        }
    }

    public void setApplyTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa01632", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.rightFirstTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.rightSecondTextView;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = this.mRightTitleView;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
        this.applyTextColor = i;
    }

    public void setCountTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68ef613", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.rightThirdTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.mRightSubTitleView;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        this.countTextColor = i;
    }

    private void setRightText12(CharSequence charSequence, boolean z) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d6a981", new Object[]{this, charSequence, new Boolean(z)});
        } else if (StringUtils.isEmpty(charSequence) || (split = charSequence.toString().split("\n")) == null || split.length < 0) {
        } else {
            this.rightText1 = "";
            this.rightText2 = "";
            if (split.length == 1) {
                this.rightText2 = split[0];
            } else {
                this.rightText1 = split[0];
                this.rightText2 = split[1];
            }
            TextView textView = this.rightFirstTextView;
            if (textView != null) {
                textView.setText(this.rightText1);
            }
            TextView textView2 = this.rightSecondTextView;
            if (textView2 != null) {
                textView2.setText(this.rightText2);
                requestLayout();
            }
            this.mRightCanClick = z;
            addRightClickView();
        }
    }

    private void setRightText3(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c4d017", new Object[]{this, charSequence});
        } else if (charSequence == null) {
        } else {
            this.rightText3 = charSequence.toString();
            TextView textView = this.rightThirdTextView;
            if (textView == null) {
                return;
            }
            textView.setText(this.rightText3);
        }
    }

    public void setLeftMoneyIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848d0d0", new Object[]{this, str});
        } else {
            this.leftMoneyIconUrl = str;
        }
    }

    public void setRightBgUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c155ac1", new Object[]{this, str});
        } else {
            this.rightBgUrl = str;
        }
    }

    private int initMeasureDouble11By2017(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3be91ad5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (this.mType != 4) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        if (this.desInfoList.size() > 1) {
            if (this.leftFirstTextView == null) {
                this.leftFirstTextView = new TextView(getContext());
                initLefTextViewBy2017(this.leftFirstTextView, marginLayoutParams, this.desInfoList.get(0));
                addView(this.leftFirstTextView);
            }
            TextView textView = this.leftFirstTextView;
            measureChild(textView, textView.getMeasuredWidth(), this.leftFirstTextView.getMeasuredHeight());
            if (this.leftSecondTextView == null) {
                this.leftSecondTextView = new TextView(getContext());
                initLefTextViewBy2017(this.leftSecondTextView, marginLayoutParams, this.desInfoList.get(1));
                addView(this.leftSecondTextView);
            }
            TextView textView2 = this.leftSecondTextView;
            measureChild(textView2, textView2.getMeasuredWidth(), this.leftSecondTextView.getMeasuredHeight());
        }
        if (this.rightFirstTextView == null) {
            this.rightFirstTextView = new TextView(getContext());
            initRightTextBy2017(this.rightFirstTextView, marginLayoutParams, 14, this.applyTextColor, this.rightText1, true);
            addView(this.rightFirstTextView);
        }
        TextView textView3 = this.rightFirstTextView;
        measureChild(textView3, textView3.getMeasuredWidth(), this.rightFirstTextView.getMeasuredHeight());
        if (this.rightSecondTextView == null) {
            this.rightSecondTextView = new TextView(getContext());
            initRightTextBy2017(this.rightSecondTextView, marginLayoutParams, 14, this.applyTextColor, this.rightText2, true);
            addView(this.rightSecondTextView);
        }
        TextView textView4 = this.rightSecondTextView;
        measureChild(textView4, textView4.getMeasuredWidth(), this.rightSecondTextView.getMeasuredHeight());
        if (this.rightThirdTextView == null) {
            this.rightThirdTextView = new TextView(getContext());
            TextView textView5 = this.rightThirdTextView;
            int i4 = this.countTextColor;
            if (i4 == 0) {
                i4 = this.mTextColor;
            }
            initRightTextBy2017(textView5, marginLayoutParams, 11, i4, this.rightText3, false);
            addView(this.rightThirdTextView);
        }
        TextView textView6 = this.rightThirdTextView;
        measureChild(textView6, textView6.getMeasuredWidth(), this.rightThirdTextView.getMeasuredHeight());
        return epo.b(92);
    }

    private void initRightTextBy2017(TextView textView, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375214c4", new Object[]{this, textView, marginLayoutParams, new Integer(i), new Integer(i2), str, new Boolean(z)});
            return;
        }
        textView.setTextSize(1, i);
        textView.setTextColor(i2);
        textView.setLayoutParams(marginLayoutParams);
        textView.setText(str);
        textView.setSingleLine();
        textView.setGravity(17);
        textView.getPaint().setFakeBoldText(z);
    }

    private void initLefTextViewBy2017(TextView textView, ViewGroup.MarginLayoutParams marginLayoutParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3000e66", new Object[]{this, textView, marginLayoutParams, str});
            return;
        }
        textView.setTextSize(1, 9.0f);
        textView.setTextColor(this.mTextColor);
        textView.setLayoutParams(marginLayoutParams);
        textView.setText(str);
    }

    private void layout11By2017(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7679e8", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mType != 4) {
        } else {
            defineImgRect2017();
            int i5 = this.moneyImgRect.right + this.PADDING_2017;
            int b2 = this.textImgRect.bottom + epo.b(8);
            int i6 = (int) (this.mLineX - this.mDashLinePaddingLeft);
            int b3 = epo.b(12) + b2;
            TextView textView = this.leftFirstTextView;
            if (textView != null) {
                textView.layout(i5, b2, i6, b3);
            }
            int b4 = epo.b(12) + b3;
            TextView textView2 = this.leftSecondTextView;
            if (textView2 != null) {
                textView2.layout(i5, b3, i6, b4);
            }
            int b5 = epo.b(17);
            int b6 = epo.b(17);
            int b7 = epo.b(3);
            int b8 = epo.b(14);
            TextView textView3 = this.rightFirstTextView;
            if (textView3 != null && StringUtils.isEmpty(textView3.getText())) {
                b5 = 0;
            }
            TextView textView4 = this.rightSecondTextView;
            if (textView4 != null && StringUtils.isEmpty(textView4.getText())) {
                b6 = 0;
            }
            TextView textView5 = this.rightThirdTextView;
            if (textView5 != null && StringUtils.isEmpty(textView5.getText())) {
                b7 = 0;
                b8 = 0;
            }
            int measuredHeight = (getMeasuredHeight() - (((b5 + b6) + b8) + b7)) / 2;
            int i7 = (int) (this.mLineX + this.mDashLinePaddingLeft);
            int measuredWidth = getMeasuredWidth() - this.mDashLinePaddingLeft;
            int i8 = measuredHeight + b5;
            TextView textView6 = this.rightFirstTextView;
            if (textView6 != null && b5 != 0) {
                textView6.layout(i7, measuredHeight, measuredWidth, i8);
            }
            int i9 = b6 + i8;
            TextView textView7 = this.rightSecondTextView;
            if (textView7 != null) {
                textView7.layout(i7, i8, measuredWidth, i9);
            }
            int i10 = i9 + b7;
            int i11 = b8 + i10;
            TextView textView8 = this.rightThirdTextView;
            if (textView8 == null) {
                return;
            }
            textView8.layout(i7, i10, measuredWidth, i11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size;
        this.mLineX = 0.7f * f;
        int i6 = (int) (this.mDensity * 100.0f);
        TextView textView = this.mBottomButton;
        if (textView != null) {
            measureChild(textView, View.MeasureSpec.makeMeasureSpec(i6, mode), i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mBottomButton.getLayoutParams();
            this.mBottomHeight = this.mBottomButton.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        if (this.mBottomTextView != null) {
            TextView textView2 = this.mBottomButton;
            if (textView2 != null) {
                size = (size - ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin) - this.mBottomButton.getMeasuredWidth();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mBottomTextView.getLayoutParams();
            measureChild(this.mBottomTextView, View.MeasureSpec.makeMeasureSpec(size, mode), i2);
            this.mBottomHeight = this.mBottomTextView.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
        }
        int i7 = size2 - ((int) this.mBottomHeight);
        int paddingTop = getPaddingTop() + this.mBottomPadding;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) ((this.mLineX - getPaddingLeft()) - this.mDashLinePaddingLeft), mode);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, mode2);
        DetailIconFontTextView detailIconFontTextView = this.mLeftPrefTitleView;
        if (detailIconFontTextView != null) {
            measureChild(detailIconFontTextView, makeMeasureSpec2, makeMeasureSpec3);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.mLeftPrefTitleView.getLayoutParams();
            i3 = marginLayoutParams3.topMargin + this.mLeftPrefTitleView.getMeasuredHeight() + marginLayoutParams3.bottomMargin;
        } else {
            i3 = 0;
        }
        TextView textView3 = this.mLeftTitleView;
        if (textView3 != null) {
            measureChild(textView3, makeMeasureSpec2, makeMeasureSpec3);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.mLeftTitleView.getLayoutParams();
            i4 = paddingTop + this.mLeftTitleView.getMeasuredHeight() + marginLayoutParams4.bottomMargin + marginLayoutParams4.topMargin;
        } else {
            i4 = paddingTop + i3;
        }
        DetailImageView detailImageView = this.mLeftTitleSuffixImageView;
        if (detailImageView != null) {
            measureChild(detailImageView, makeMeasureSpec2, makeMeasureSpec3);
        }
        List<TextView> list = this.mLeftIconViews;
        if (list != null) {
            for (TextView textView4 : list) {
                measureChild(textView4, makeMeasureSpec2, makeMeasureSpec3);
            }
        }
        List<TextView> list2 = this.mLeftDescViews;
        if (list2 != null) {
            i5 = i4 + this.mMarginTitleDesc;
            int i8 = 0;
            for (TextView textView5 : list2) {
                measureChild(textView5, makeMeasureSpec2, makeMeasureSpec3);
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView5.getLayoutParams();
                i8 = textView5.getMeasuredHeight() + marginLayoutParams5.bottomMargin + marginLayoutParams5.topMargin;
                i5 += i8;
            }
            if (this.mLeftDescViews.size() < 2) {
                i5 += i8;
            }
        } else {
            i5 = i4 + this.mMarginTitleDesc + ((int) (this.mDensity * 24.0f));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec((int) (f - this.mLineX), mode);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i5, mode2);
        TextView textView6 = this.mRightTitleView;
        if (textView6 != null) {
            measureChild(textView6, makeMeasureSpec4, makeMeasureSpec5);
        }
        TextView textView7 = this.mRightSubTitleView;
        if (textView7 != null) {
            measureChild(textView7, makeMeasureSpec4, makeMeasureSpec5);
        }
        int i9 = (int) (i5 + this.mBottomHeight);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, mode2);
        } else {
            makeMeasureSpec = mode2 != 1073741824 ? 0 : i2;
        }
        int initMeasureDouble11By2017 = initMeasureDouble11By2017(i, i2, makeMeasureSpec);
        if (makeMeasureSpec >= initMeasureDouble11By2017) {
            initMeasureDouble11By2017 = makeMeasureSpec;
        }
        setMeasuredDimension(i, initMeasureDouble11By2017);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TextView textView;
        int paddingRight;
        int i13;
        int measuredHeight;
        int paddingRight2;
        int i14;
        int measuredHeight2;
        int i15;
        int measuredHeight3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight3 = (i3 - getPaddingRight()) - i;
        int i16 = (int) (this.mLineX - this.mDashLinePaddingLeft);
        float paddingBottom = (i4 - getPaddingBottom()) - i2;
        int i17 = (int) ((paddingBottom - this.mBottomHeight) - this.mBottomPadding);
        if (this.mPath == null) {
            buidPath();
        }
        DetailIconFontTextView detailIconFontTextView = this.mLeftPrefTitleView;
        if (detailIconFontTextView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) detailIconFontTextView.getLayoutParams();
            i7 = Math.min(marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin + this.mLeftPrefTitleView.getMeasuredWidth(), i16);
            TextView textView2 = this.mLeftTitleView;
            if (textView2 != null) {
                i15 = ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).topMargin + paddingTop;
                measuredHeight3 = this.mLeftTitleView.getBaseline();
            } else {
                i15 = marginLayoutParams.topMargin + paddingTop;
                measuredHeight3 = this.mLeftPrefTitleView.getMeasuredHeight();
            }
            i8 = i15 + measuredHeight3;
            this.mLeftPrefTitleView.layout(marginLayoutParams.leftMargin + paddingLeft, i8 - this.mLeftPrefTitleView.getBaseline(), i7 - marginLayoutParams.rightMargin, i8);
            i5 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + this.mLeftPrefTitleView.getMeasuredWidth();
            i6 = marginLayoutParams.topMargin + paddingTop + marginLayoutParams.bottomMargin + this.mLeftPrefTitleView.getMeasuredWidth();
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        TextView textView3 = this.mLeftTitleView;
        if (textView3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView3.getLayoutParams();
            int i18 = paddingLeft + i5;
            i7 = Math.min(marginLayoutParams2.leftMargin + i18 + marginLayoutParams2.rightMargin + this.mLeftTitleView.getMeasuredWidth(), i16);
            i11 = Math.min(i17, ((marginLayoutParams2.topMargin + paddingTop) + marginLayoutParams2.bottomMargin) + this.mLeftTitleView.getMeasuredHeight()) - marginLayoutParams2.bottomMargin;
            this.mLeftTitleView.layout(i18 + marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin + paddingTop, i7 - marginLayoutParams2.rightMargin, i11);
            i10 = this.mLeftTitleView.getBaseline() + paddingTop + marginLayoutParams2.topMargin;
            i9 = 0 + i11;
            i5 += marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.mLeftTitleView.getMeasuredWidth();
        } else {
            i9 = 0 + i6;
            i10 = i8;
            i11 = 0;
        }
        DetailImageView detailImageView = this.mLeftTitleSuffixImageView;
        if (detailImageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) detailImageView.getLayoutParams();
            int i19 = i5 + paddingLeft;
            i7 = Math.min(marginLayoutParams3.leftMargin + i19 + marginLayoutParams3.rightMargin + this.mLeftTitleSuffixImageView.getMeasuredWidth(), i16);
            if (this.couponType == 15) {
                int b2 = epo.b(5);
                this.mLeftTitleSuffixImageView.layout(i19 + marginLayoutParams3.leftMargin, (i11 - this.mLeftTitleSuffixImageView.getMeasuredHeight()) - b2, i7, i11 - b2);
            } else {
                this.mLeftTitleSuffixImageView.layout(i19 + marginLayoutParams3.leftMargin, i10 - this.mLeftTitleSuffixImageView.getMeasuredHeight(), i7, i10);
            }
        }
        List<TextView> list = this.mLeftIconViews;
        if (list != null) {
            int i20 = i7;
            for (TextView textView4 : list) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) textView4.getLayoutParams();
                i7 += marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin + textView4.getMeasuredWidth();
                i20 += marginLayoutParams4.leftMargin;
                if (i7 > i16) {
                    textView4.layout(0, 0, 0, 0);
                } else {
                    int i21 = i7 - marginLayoutParams4.rightMargin;
                    textView4.layout(i20, i10 - textView4.getMeasuredHeight(), i21, i10);
                    textView4.getBaseline();
                    i20 = marginLayoutParams4.rightMargin + i21;
                    i7 = i20;
                }
            }
        }
        List<TextView> list2 = this.mLeftDescViews;
        if (list2 != null) {
            int i22 = i9 + this.mMarginTitleDesc;
            for (TextView textView5 : list2) {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView5.getLayoutParams();
                int i23 = i22 + marginLayoutParams5.topMargin;
                textView5.layout(marginLayoutParams5.leftMargin + paddingLeft, marginLayoutParams5.topMargin + i23, Math.min(i16, ((marginLayoutParams5.leftMargin + paddingLeft) + marginLayoutParams5.rightMargin) + textView5.getMeasuredWidth()) - marginLayoutParams5.rightMargin, marginLayoutParams5.topMargin + i23 + textView5.getMeasuredHeight());
                i22 = i23 + marginLayoutParams5.topMargin + marginLayoutParams5.bottomMargin + textView5.getMeasuredHeight();
            }
        }
        int i24 = (int) (paddingBottom - this.mBottomHeight);
        View view = this.mRightClickView;
        if (view != null) {
            i12 = 0;
            view.layout((int) this.mLineX, 0, paddingRight3, i24);
        } else {
            i12 = 0;
        }
        if (this.mRightTitleView != null) {
            if (((int) ((paddingRight3 - this.mLineX) + getPaddingRight())) > this.mRightTitleView.getMeasuredWidth()) {
                i14 = (int) (((paddingRight2 - this.mRightTitleView.getMeasuredWidth()) / 2) + this.mLineX);
            } else {
                i14 = this.mDashLinePaddingRight;
            }
            if (this.mRightSubTitleView == null) {
                measuredHeight2 = (i24 - this.mRightTitleView.getMeasuredHeight()) / 2;
            } else {
                measuredHeight2 = (((i24 - this.mRightTitleView.getMeasuredHeight()) - this.mRightSubTitleView.getMeasuredHeight()) - this.mMarginRightTitleSubTitle) / 2;
            }
            TextView textView6 = this.mRightTitleView;
            textView6.layout(i14, measuredHeight2, Math.min(textView6.getMeasuredWidth() + i14, paddingRight3), this.mRightTitleView.getMeasuredHeight() + measuredHeight2);
        }
        if (this.mRightSubTitleView != null) {
            if (((int) ((paddingRight3 - this.mLineX) + getPaddingRight())) > this.mRightSubTitleView.getMeasuredWidth()) {
                i13 = (int) (((paddingRight - this.mRightSubTitleView.getMeasuredWidth()) / 2) + this.mLineX);
            } else {
                i13 = this.mDashLinePaddingRight;
            }
            TextView textView7 = this.mRightTitleView;
            if (textView7 == null) {
                measuredHeight = (i24 - this.mRightSubTitleView.getMeasuredHeight()) / 2;
            } else {
                measuredHeight = (((i24 + textView7.getMeasuredHeight()) - this.mRightSubTitleView.getMeasuredHeight()) + this.mMarginRightTitleSubTitle) / 2;
            }
            TextView textView8 = this.mRightSubTitleView;
            textView8.layout(i13, measuredHeight, Math.min(textView8.getMeasuredWidth() + i13, paddingRight3), this.mRightSubTitleView.getMeasuredHeight() + measuredHeight);
        }
        TextView textView9 = this.mBottomButton;
        if (textView9 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) textView9.getLayoutParams();
            int i25 = (int) ((paddingBottom - this.mBottomHeight) + marginLayoutParams6.topMargin + (this.mDensity * 2.0f));
            TextView textView10 = this.mBottomButton;
            textView10.layout(paddingRight3 - textView10.getMeasuredWidth(), i25, paddingRight3, this.mBottomButton.getMeasuredHeight() + i25);
            i12 = this.mBottomButton.getMeasuredWidth() + marginLayoutParams6.leftMargin;
        }
        if (this.mBottomTextView != null) {
            int i26 = (int) ((paddingBottom - this.mBottomHeight) + ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin);
            this.mBottomTextView.layout(getPaddingLeft(), i26, paddingRight3 - i12, this.mBottomTextView.getMeasuredHeight() + i26);
        }
        layout11By2017(z, i, i2, i3, i4);
    }

    private void buildPathBy2017() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74547cd5", new Object[]{this});
            return;
        }
        this.linePath = new Path();
        this.linePath.moveTo(this.mLineX, 0.0f);
        this.linePath.lineTo(this.mLineX, getMeasuredHeight());
    }

    private void buidPath() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd74fa", new Object[]{this});
            return;
        }
        if (this.mType == 4) {
            buildPathBy2017();
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight() - this.mBottomHeight;
        if (!this.hasBottom || (i = this.mType) == 3 || i == 2) {
            if (this.mType == 0) {
                buildSawtoothPath(measuredWidth, measuredHeight);
            } else {
                buildNormalPath(measuredWidth, measuredHeight);
            }
        } else {
            if (i == 0) {
                buildSawtoothPath(measuredWidth, measuredHeight);
            } else {
                buildHasBottomPath(measuredWidth, measuredHeight);
            }
            buildBottomPath(measuredWidth, measuredHeight);
        }
        this.mDashLinePath = new Path();
        this.mDashLinePath.moveTo(this.mLineX, this.hasPit ? this.mPointRadius : 0.0f);
        if (this.hasBottom) {
            this.mDashLinePath.lineTo(this.mLineX, measuredHeight);
        } else {
            this.mDashLinePath.lineTo(this.mLineX, this.hasPit ? measuredHeight - this.mPointRadius : measuredHeight);
        }
        if (!this.hasRightFilter) {
            return;
        }
        this.mRightFilter = new Path();
        float f = measuredWidth - (((measuredWidth - this.mLineX) * 3.0f) / 16.0f);
        this.mRightFilter.arcTo(new RectF(f, (-0.05f) * measuredHeight, f + measuredHeight, measuredHeight + (0.05f * measuredHeight)), 90.0f, 180.0f, false);
    }

    private void buildSawtoothPath(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2371019", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mPath = new Path();
        this.mPath.moveTo(0.0f, 0.0f);
        this.mPath.lineTo(f, 0.0f);
        float f3 = f2 / 25.0f;
        float f4 = 0.8f * f3;
        int i = 0;
        float f5 = 0.0f;
        while (i < 12) {
            float f6 = f5 + f3;
            this.mPath.lineTo(f, f6);
            float f7 = f4 / 2.0f;
            float f8 = f6 + f3;
            this.mPath.arcTo(new RectF(f - f7, f6, f7 + f, f8), 270.0f, -180.0f);
            i++;
            f5 = f8;
        }
        this.mPath.lineTo(f, f2);
        this.mPath.lineTo(0.0f, f2);
        float f9 = 0.0f;
        for (int i2 = 0; i2 < 12; i2++) {
            float f10 = f9 + f3;
            float f11 = f2 - f10;
            this.mPath.lineTo(0.0f, f11);
            float f12 = f4 / 2.0f;
            this.mPath.arcTo(new RectF(0.0f - f12, f11 - f3, f12, f11), 90.0f, -180.0f);
            f9 = f10 + f3;
        }
        this.mPath.lineTo(0.0f, 0.0f);
        this.mPath.close();
    }

    private void buildNormalPath(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7fbe01", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mPath = new Path();
        this.mPath.moveTo(this.mRedius, 0.0f);
        this.mPath.lineTo(this.mLineX - this.mPointRadius, 0.0f);
        if (this.hasPit) {
            Path path = this.mPath;
            float f3 = this.mLineX;
            float f4 = this.mPointRadius;
            path.arcTo(new RectF(f3 - f4, -f4, f3 + f4, f4), 180.0f, -180.0f);
        }
        this.mPath.lineTo(f - this.mRedius, 0.0f);
        Path path2 = this.mPath;
        float f5 = this.mRedius;
        path2.arcTo(new RectF(f - (f5 * 2.0f), 0.0f, f, f5 * 2.0f), 270.0f, 90.0f);
        this.mPath.lineTo(f, f2 - this.mRedius);
        Path path3 = this.mPath;
        float f6 = this.mRedius;
        path3.arcTo(new RectF(f - (f6 * 2.0f), f2 - (f6 * 2.0f), f, f2), 0.0f, 90.0f);
        this.mPath.lineTo(this.mLineX + this.mPointRadius, f2);
        if (this.hasPit) {
            Path path4 = this.mPath;
            float f7 = this.mLineX;
            float f8 = this.mPointRadius;
            path4.arcTo(new RectF(f7 - f8, f2 - f8, f7 + f8, f8 + f2), 0.0f, -180.0f);
        }
        this.mPath.lineTo(this.mRedius, f2);
        Path path5 = this.mPath;
        float f9 = this.mRedius;
        path5.arcTo(new RectF(0.0f, f2 - (f9 * 2.0f), f9 * 2.0f, f2), 90.0f, 90.0f);
        this.mPath.lineTo(0.0f, this.mRedius);
        Path path6 = this.mPath;
        float f10 = this.mRedius;
        path6.arcTo(new RectF(0.0f, 0.0f, f10 * 2.0f, f10 * 2.0f), -180.0f, 90.0f);
        this.mPath.close();
    }

    private void buildHasBottomPath(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a62923", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mPath = new Path();
        this.mPath.moveTo(this.mRedius, 0.0f);
        this.mPath.lineTo(this.mLineX - this.mPointRadius, 0.0f);
        if (this.hasPit) {
            Path path = this.mPath;
            float f3 = this.mLineX;
            float f4 = this.mPointRadius;
            path.arcTo(new RectF(f3 - f4, -f4, f3 + f4, f4), 180.0f, -180.0f);
        }
        this.mPath.lineTo(f - this.mRedius, 0.0f);
        Path path2 = this.mPath;
        float f5 = this.mRedius;
        path2.arcTo(new RectF(f - (f5 * 2.0f), 0.0f, f, f5 * 2.0f), 270.0f, 90.0f);
        this.mPath.lineTo(f, f2);
        this.mPath.lineTo(0.0f, f2);
        this.mPath.lineTo(0.0f, this.mRedius);
        Path path3 = this.mPath;
        float f6 = this.mRedius;
        path3.arcTo(new RectF(0.0f, 0.0f, f6 * 2.0f, f6 * 2.0f), -180.0f, 90.0f);
        this.mPath.close();
    }

    private void buildBottomPath(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2495d645", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mBottomPath = new Path();
        this.mBottomPath.moveTo(0.0f, f2);
        this.mBottomPath.lineTo(f, f2);
        this.mBottomPath.lineTo(f, (this.mBottomHeight + f2) - this.mRedius);
        Path path = this.mBottomPath;
        float f3 = this.mRedius;
        float f4 = this.mBottomHeight;
        path.arcTo(new RectF(f - (f3 * 2.0f), (f2 + f4) - (f3 * 2.0f), f, f4 + f2), 0.0f, 90.0f);
        this.mBottomPath.lineTo(this.mRedius, this.mBottomHeight + f2);
        Path path2 = this.mBottomPath;
        float f5 = this.mBottomHeight;
        float f6 = this.mRedius;
        path2.arcTo(new RectF(0.0f, (f2 + f5) - (f6 * 2.0f), f6 * 2.0f, f2 + f5), 90.0f, 90.0f);
        this.mBottomPath.close();
    }

    private void createCornerBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d80db87", new Object[]{this});
            return;
        }
        float f = this.mRedius;
        this.mCornerBitmap = Bitmap.createBitmap((int) f, (int) f, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(this.mRedius, 0.0f);
        float f2 = this.mRedius;
        path.lineTo(f2, f2);
        path.lineTo(0.0f, this.mRedius);
        float f3 = this.mRedius;
        path.arcTo(new RectF(0.0f, 0.0f, f3 * 2.0f, f3 * 2.0f), -180.0f, 90.0f);
        path.close();
        Canvas canvas = new Canvas(this.mCornerBitmap);
        float f4 = this.mRedius;
        canvas.drawRect(0.0f, 0.0f, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawPath(path, paint);
    }

    private void clipPath(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d138fb49", new Object[]{this, canvas});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.mCornerBitmap == null) {
            return;
        }
        Matrix matrix = new Matrix();
        canvas.drawBitmap(this.mCornerBitmap, matrix, this.mPaint);
        matrix.setRotate(90.0f);
        float f = measuredWidth;
        matrix.postTranslate(f, 0.0f);
        canvas.drawBitmap(this.mCornerBitmap, matrix, this.mPaint);
        matrix.setRotate(180.0f);
        float f2 = measuredHeight;
        matrix.postTranslate(f, f2);
        canvas.drawBitmap(this.mCornerBitmap, matrix, this.mPaint);
        matrix.setRotate(-90.0f);
        matrix.postTranslate(0.0f, f2);
        canvas.drawBitmap(this.mCornerBitmap, matrix, this.mPaint);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.mType == 4) {
            drawImageby2017(canvas, this.mPaint);
            super.draw(canvas);
            this.mPaint.setPathEffect(null);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setColor(this.mDashLineColor);
            canvas.drawPath(this.linePath, this.mPaint);
            clipPath(canvas);
        } else {
            this.mPaint.setPathEffect(null);
            this.mPaint.setColor(this.mBgColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.mPath, this.mPaint);
            tileWatermark(canvas, this.mPaint);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setPathEffect(this.mDashLineEffects);
            this.mPaint.setColor(this.mDashLineColor);
            canvas.drawPath(this.mDashLinePath, this.mPaint);
            if (this.hasBottom && this.mBottomPath != null) {
                this.mPaint.setColor(this.mBottomBgColor);
                this.mPaint.setPathEffect(null);
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.drawPath(this.mBottomPath, this.mPaint);
            }
            super.draw(canvas);
            if (!this.hasRightFilter || this.mRightFilter == null) {
                return;
            }
            this.mPaint.setColor(this.mRightFilterColor);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.mRightFilter, this.mPaint);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.taobao.android.detail.core.detail.widget.coupon.TMTicket$5] */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        createCornerBitmap();
        if (this.mType == 4) {
            a aVar = new a();
            if (this.mapBGBitmap == null) {
                aVar.a(this.leftBgUrl, new b() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.b
                    public void a(Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                        } else {
                            TMTicket.access$002(TMTicket.this, bitmap);
                        }
                    }
                });
            }
            if (this.rightBGBitmap == null) {
                aVar.a(this.rightBgUrl, new b() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.b
                    public void a(Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                        } else {
                            TMTicket.access$102(TMTicket.this, bitmap);
                        }
                    }
                });
            }
            if (this.moneyBitmap == null) {
                aVar.a(this.leftMoneyIconUrl, new b() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.b
                    public void a(Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                        } else {
                            TMTicket.access$202(TMTicket.this, bitmap);
                        }
                    }
                });
            }
            if (this.textBitmap == null) {
                aVar.a(this.double11TextIconUrl, new b() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.b
                    public void a(Bitmap bitmap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
                        } else {
                            TMTicket.access$302(TMTicket.this, bitmap);
                        }
                    }
                });
            }
        }
        if (this.mWatermark != null || StringUtils.isEmpty(this.mWatermarkUrl)) {
            return;
        }
        new AsyncTask<Object, Object, Object>() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute(objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00f6 A[ADDED_TO_REGION, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
            /* JADX WARN: Type inference failed for: r2v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v8, types: [int] */
            @Override // android.os.AsyncTask
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object doInBackground(java.lang.Object... r8) {
                /*
                    Method dump skipped, instructions count: 290
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.AnonymousClass5.doInBackground(java.lang.Object[]):java.lang.Object");
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                    return;
                }
                super.onPostExecute(obj);
                TMTicket.this.invalidate();
            }
        }.execute(new Object[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mWatermark;
        if (bitmap != null) {
            bitmap.recycle();
            this.mWatermark = null;
        }
        recycledBmpBy2017();
    }

    private void tileWatermark(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e700093d", new Object[]{this, canvas, paint});
            return;
        }
        Bitmap bitmap = this.mWatermark;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight() - ((int) this.mBottomHeight);
        int width = this.mWatermark.getWidth();
        int height = this.mWatermark.getHeight();
        for (int i = 0; i < measuredWidth + width; i += width) {
            for (int i2 = 0; i2 < measuredHeight + height; i2 += height) {
                canvas.drawBitmap(this.mWatermark, i, i2, paint);
            }
        }
    }

    private void defineImgRect2017() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fe4d77", new Object[]{this});
        } else if (this.moneyImgRect != null) {
        } else {
            int i = this.CAT_W;
            int i2 = this.CAT_H;
            int i3 = this.TEXT_MIN_W;
            int i4 = this.PADDING_2017;
            int i5 = (((int) this.mLineX) - i3) - (i4 * 2);
            if (i5 < i) {
                i2 = (int) ((i5 / i) * i2);
                i = i5;
            }
            int measuredHeight = (getMeasuredHeight() - i2) / 2;
            int i6 = i + i4;
            this.moneyImgRect = new Rect(i4, measuredHeight, i6, i2 + measuredHeight);
            int i7 = i6 + this.PADDING_2017;
            int i8 = this.PADDING_TOP_TEXT;
            this.textImgRect = new Rect(i7, i8, this.TEXT_W + i7, this.TEXT_H + i8);
        }
    }

    private void drawImageby2017(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5919ed21", new Object[]{this, canvas, paint});
            return;
        }
        defineImgRect2017();
        Bitmap bitmap = this.mapBGBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.mapBGBitmap, (Rect) null, new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight()), paint);
        }
        Bitmap bitmap2 = this.rightBGBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            canvas.drawBitmap(this.rightBGBitmap, (Rect) null, new Rect((int) this.mLineX, 0, getMeasuredWidth(), getMeasuredHeight()), paint);
        }
        Bitmap bitmap3 = this.moneyBitmap;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            canvas.drawBitmap(this.moneyBitmap, (Rect) null, this.moneyImgRect, paint);
        }
        Bitmap bitmap4 = this.textBitmap;
        if (bitmap4 == null || bitmap4.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.textBitmap, (Rect) null, this.textImgRect, paint);
    }

    private void recycledBmpBy2017() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddd8b76", new Object[]{this});
        } else if (this.mType != 4) {
        } else {
            Bitmap bitmap = this.mCornerBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.mCornerBitmap = null;
            }
            Bitmap bitmap2 = this.mapBGBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.mapBGBitmap = null;
            }
            Bitmap bitmap3 = this.rightBGBitmap;
            if (bitmap3 != null) {
                bitmap3.recycle();
                this.rightBGBitmap = null;
            }
            Bitmap bitmap4 = this.moneyBitmap;
            if (bitmap4 != null) {
                bitmap4.recycle();
                this.moneyBitmap = null;
            }
            Bitmap bitmap5 = this.textBitmap;
            if (bitmap5 == null) {
                return;
            }
            bitmap5.recycle();
            this.textBitmap = null;
        }
    }

    private static Bitmap scaleBitmap(Bitmap bitmap, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("193b1b50", new Object[]{bitmap, new Float(f)});
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static int simpleSize(BitmapFactory.Options options, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1261cbe", new Object[]{options, new Integer(i)})).intValue();
        }
        int i4 = options.outHeight;
        if (i4 > i && (i2 = i4 / 2) > 0 && i > 0) {
            while (i2 / i3 > i) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(568657177);
        }

        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.detail.core.detail.widget.coupon.TMTicket$a$1] */
        public void a(final String str, final b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce677e7", new Object[]{this, str, bVar});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                new AsyncTask<Object, Object, Object>() { // from class: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                        if (str2.hashCode() == -1325021319) {
                            super.onPostExecute(objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0100 A[ADDED_TO_REGION, RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
                    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v6 */
                    @Override // android.os.AsyncTask
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object doInBackground(java.lang.Object... r8) {
                        /*
                            Method dump skipped, instructions count: 294
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.widget.coupon.TMTicket.a.AnonymousClass1.doInBackground(java.lang.Object[]):java.lang.Object");
                    }

                    @Override // android.os.AsyncTask
                    public void onPostExecute(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                            return;
                        }
                        super.onPostExecute(obj);
                        TMTicket.this.invalidate();
                    }
                }.execute(new Object[0]);
            }
        }
    }
}
