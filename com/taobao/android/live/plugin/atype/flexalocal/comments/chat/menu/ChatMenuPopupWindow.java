package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class ChatMenuPopupWindow extends PopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout mContainer1;
    private FrameLayout mContainer2;
    private FrameLayout mContainer3;
    private Context mContext;
    private TUrlImageView mImageView1;
    private TUrlImageView mImageView2;
    private TUrlImageView mImageView3;
    private a mListener;
    private int mNeedMovedDistance;
    private View mRootView;
    private List<ChatMenuItem> mSourceList;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TUrlImageView mTriangleImageView;

    static {
        kge.a(-1248621251);
    }

    public static /* synthetic */ Object ipc$super(ChatMenuPopupWindow chatMenuPopupWindow, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ChatMenuPopupWindow(Context context, List<ChatMenuItem> list) {
        super(context);
        this.mContext = context;
        this.mSourceList = list;
        setupConfig();
    }

    private void setupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
            return;
        }
        setClippingEnabled(true);
        this.mRootView = LayoutInflater.from(this.mContext).inflate(R.layout.layout_popup_window_chat_behavior_flexalocal, (ViewGroup) null);
        setupData(this.mRootView);
        setContentView(this.mRootView);
    }

    private void setupData(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607dd944", new Object[]{this, view});
            return;
        }
        this.mContainer1 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container1);
        this.mContainer2 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container2);
        this.mContainer3 = (FrameLayout) view.findViewById(R.id.chat_menu_item_container3);
        this.mImageView1 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image1);
        this.mImageView2 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image2);
        this.mImageView3 = (TUrlImageView) view.findViewById(R.id.chat_menu_item_image3);
        this.mTextView1 = (TextView) view.findViewById(R.id.chat_menu_item_tv1);
        this.mTextView2 = (TextView) view.findViewById(R.id.chat_menu_item_tv2);
        this.mTextView3 = (TextView) view.findViewById(R.id.chat_menu_item_tv3);
        this.mTriangleImageView = (TUrlImageView) view.findViewById(R.id.chat_menu_bottom_triangle);
        this.mTriangleImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01TJA3YE1dRlNe1hswB_!!6000000003733-2-tps-24-9.png");
        List<ChatMenuItem> list = this.mSourceList;
        if (list == null || list.size() == 0) {
            return;
        }
        refreshData();
    }

    private void refreshData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf67b2c", new Object[]{this});
            return;
        }
        List<ChatMenuItem> list = this.mSourceList;
        if (list != null && list.size() == 1) {
            this.mContainer2.setVisibility(8);
            this.mContainer3.setVisibility(8);
            ChatMenuItem chatMenuItem = this.mSourceList.get(0);
            initItemConfig(this.mContainer1, chatMenuItem);
            if (chatMenuItem == null) {
                return;
            }
            this.mImageView1.setImageUrl(chatMenuItem.icon);
            this.mTextView1.setText(chatMenuItem.text);
        } else if (this.mSourceList.size() == 3) {
            ChatMenuItem chatMenuItem2 = this.mSourceList.get(0);
            initItemConfig(this.mContainer1, chatMenuItem2);
            ChatMenuItem chatMenuItem3 = this.mSourceList.get(1);
            initItemConfig(this.mContainer2, chatMenuItem3);
            ChatMenuItem chatMenuItem4 = this.mSourceList.get(2);
            initItemConfig(this.mContainer3, chatMenuItem4);
            if (chatMenuItem2 != null) {
                this.mImageView1.setImageUrl(chatMenuItem2.icon);
                this.mTextView1.setText(chatMenuItem2.text);
            }
            if (chatMenuItem3 != null) {
                this.mImageView2.setImageUrl(chatMenuItem3.icon);
                this.mTextView2.setText(chatMenuItem3.text);
            }
            if (chatMenuItem4 == null) {
                return;
            }
            this.mImageView3.setImageUrl(chatMenuItem4.icon);
            this.mTextView3.setText(chatMenuItem4.text);
        } else if (this.mSourceList.size() != 2) {
        } else {
            ChatMenuItem chatMenuItem5 = this.mSourceList.get(0);
            initItemConfig(this.mContainer1, chatMenuItem5);
            ChatMenuItem chatMenuItem6 = this.mSourceList.get(1);
            initItemConfig(this.mContainer2, chatMenuItem6);
            if (chatMenuItem5 != null) {
                this.mImageView1.setImageUrl(chatMenuItem5.icon);
                this.mTextView1.setText(chatMenuItem5.text);
            }
            if (chatMenuItem6 != null) {
                this.mImageView2.setImageUrl(chatMenuItem6.icon);
                this.mTextView2.setText(chatMenuItem6.text);
            }
            this.mContainer3.setVisibility(8);
        }
    }

    public void showAtTopCenter(View view) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43700bd1", new Object[]{this, view});
            return;
        }
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        this.mRootView.measure(0, 0);
        int measuredWidth = this.mRootView.getMeasuredWidth();
        int measuredHeight = this.mRootView.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2);
        if (width < d.a(this.mContext, 12.0f)) {
            this.mNeedMovedDistance = d.a(this.mContext, 12.0f) - width;
            width = d.a(this.mContext, 12.0f);
        } else {
            this.mNeedMovedDistance = 0;
        }
        showAtLocation(view, 0, width, iArr[1] - measuredHeight);
        if (this.mNeedMovedDistance <= 0 || (tUrlImageView = this.mTriangleImageView) == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tUrlImageView.getLayoutParams();
        layoutParams.leftMargin -= this.mNeedMovedDistance;
        this.mTriangleImageView.setLayoutParams(layoutParams);
    }

    private void initItemConfig(View view, final ChatMenuItem chatMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5354eea9", new Object[]{this, view, chatMenuItem});
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.chat.menu.-$$Lambda$ChatMenuPopupWindow$y_MEqbiZhuohOcssBCEFg4LJbh8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatMenuPopupWindow.this.lambda$initItemConfig$12$ChatMenuPopupWindow(chatMenuItem, view2);
                }
            });
        }
    }

    public /* synthetic */ void lambda$initItemConfig$12$ChatMenuPopupWindow(ChatMenuItem chatMenuItem, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9740ccd", new Object[]{this, chatMenuItem, view});
            return;
        }
        dismiss();
        a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.onItemClick(chatMenuItem);
    }

    public void setChatItemClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6a844c", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }
}
