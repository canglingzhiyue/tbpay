package com.taobao.uikit.actionbar;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class TBPublicMenuItem implements Cloneable, Comparable<TBPublicMenuItem> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FROM_THIRD_PARTY = 2;
    public static final int FROM_UIKIT = 1;
    public MessageMode mMessageMode;
    public int mId = -1;
    public String mImgTipsUri = null;
    public Integer mImageTipResource = null;
    public String mMessage = "";
    public Drawable mIconDrawable = null;
    public String mIconUrl = null;
    public String mUTControlName = null;
    public String mNavUrl = null;
    public String mTitle = null;
    public int mSource = 2;
    public String mName = null;
    public boolean mNeedLogin = false;
    public boolean mVisible = true;
    private int mOrder = 0;
    private boolean mMenuNeedToBeClosed = true;
    private WeakReference<TBPublicMenuItemObserver> mItemObserverRef = null;
    public boolean isI18nSupported = false;

    /* loaded from: classes9.dex */
    public enum MessageMode {
        NONE,
        DOT_ONLY,
        DOT_WITH_NUMBER,
        IMG_TIPS,
        TEXT;

        public static MessageMode valueOf(int i) {
            return i == DOT_ONLY.ordinal() ? DOT_ONLY : i == DOT_WITH_NUMBER.ordinal() ? DOT_WITH_NUMBER : i == TEXT.ordinal() ? TEXT : i == IMG_TIPS.ordinal() ? IMG_TIPS : NONE;
        }
    }

    static {
        kge.a(187115259);
        kge.a(-723128125);
        kge.a(415966670);
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.mId;
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.mId = i;
        }
    }

    public MessageMode getMessageMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageMode) ipChange.ipc$dispatch("6130aeb", new Object[]{this}) : this.mMessageMode;
    }

    public void setMessageMode(MessageMode messageMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef17cf1", new Object[]{this, messageMode});
        } else {
            this.mMessageMode = messageMode;
        }
    }

    public void setImageTipUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9369a95b", new Object[]{this, str});
        } else {
            this.mImgTipsUri = str;
        }
    }

    public String getImageTipUri() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2505c1e3", new Object[]{this}) : this.mImgTipsUri;
    }

    public void setImageTipResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b9f36c", new Object[]{this, new Integer(i)});
        } else {
            this.mImageTipResource = Integer.valueOf(i);
        }
    }

    public Integer getImageTipResource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e2cbd9d2", new Object[]{this}) : this.mImageTipResource;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.mMessage;
    }

    public void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.mMessage = str;
        }
    }

    public Drawable getIconDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("d7ea3c86", new Object[]{this}) : this.mIconDrawable;
    }

    public void setIconDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a968e4", new Object[]{this, drawable});
        } else {
            this.mIconDrawable = drawable;
        }
    }

    public String getIconUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this}) : this.mIconUrl;
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.mIconUrl = str;
        }
    }

    public String getUTControlName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b15e2306", new Object[]{this}) : this.mUTControlName;
    }

    public void setUTControlName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af061f98", new Object[]{this, str});
        } else {
            this.mUTControlName = str;
        }
    }

    public String getNavUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7553bf7", new Object[]{this}) : this.mNavUrl;
    }

    public void setNavUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc305f", new Object[]{this, str});
        } else {
            this.mNavUrl = str;
        }
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.mTitle;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.mTitle = str;
        }
    }

    public boolean isNeedLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue() : this.mNeedLogin;
    }

    public void setNeedLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bca5f9c", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedLogin = z;
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : this.mVisible;
    }

    public void setVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
        } else {
            this.mVisible = z;
        }
    }

    public boolean isAddByUikit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ede8a91f", new Object[]{this})).booleanValue() : this.mSource == 1;
    }

    public int getSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abef1f0b", new Object[]{this})).intValue() : this.mSource;
    }

    public void setSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685aaa5f", new Object[]{this, new Integer(i)});
        } else {
            this.mSource = i;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mName;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.mName = str;
        }
    }

    public boolean checkValidation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d32bac", new Object[]{this})).booleanValue();
        }
        MessageMode messageMode = this.mMessageMode;
        if (messageMode != null && messageMode == MessageMode.DOT_WITH_NUMBER) {
            try {
                Integer.valueOf(this.mMessage);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    public void setOrder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a55ed0", new Object[]{this, new Integer(i)});
        } else {
            this.mOrder = i;
        }
    }

    public int getOrder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8042612", new Object[]{this})).intValue() : this.mOrder;
    }

    public boolean isMenuNeedToBeClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3538e74", new Object[]{this})).booleanValue() : this.mMenuNeedToBeClosed;
    }

    public void setMenuNeedToBeClosed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ffa42c", new Object[]{this, new Boolean(z)});
        } else {
            this.mMenuNeedToBeClosed = z;
        }
    }

    public void setDataChangeObserver(TBPublicMenuItemObserver tBPublicMenuItemObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b031d7", new Object[]{this, tBPublicMenuItemObserver});
        } else {
            this.mItemObserverRef = new WeakReference<>(tBPublicMenuItemObserver);
        }
    }

    public void resetDataChangeObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a2105a6", new Object[]{this});
            return;
        }
        WeakReference<TBPublicMenuItemObserver> weakReference = this.mItemObserverRef;
        if (weakReference == null) {
            return;
        }
        weakReference.clear();
    }

    public void setIsI18nSupported(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e575f49", new Object[]{this, new Boolean(z)});
        } else {
            this.isI18nSupported = z;
        }
    }

    public boolean getIsI18nSupported() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f652b17b", new Object[]{this})).booleanValue() : this.isI18nSupported;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        if (!checkValidation()) {
            return null;
        }
        return new Builder().setTitle(getTitle()).setMessageMode(getMessageMode()).setUTControlName(getUTControlName()).setNavUrl(getNavUrl()).setIcon(getIconDrawable()).setIcon(getIconUrl()).setMessage(getMessage()).setId(getId()).setName(getName()).setSource(getSource()).setMenuNeedtoBeClosedAfterItemClicked(isMenuNeedToBeClosed()).setImageTipUri(getImageTipUri()).setI18nSupported(getIsI18nSupported()).build();
    }

    @Override // java.lang.Comparable
    public int compareTo(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8f68df2", new Object[]{this, tBPublicMenuItem})).intValue();
        }
        int order = getOrder();
        int order2 = tBPublicMenuItem.getOrder();
        if (order < order2) {
            return -1;
        }
        return order == order2 ? 0 : 1;
    }

    public void update() {
        TBPublicMenuItemObserver tBPublicMenuItemObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        WeakReference<TBPublicMenuItemObserver> weakReference = this.mItemObserverRef;
        if (weakReference == null || (tBPublicMenuItemObserver = weakReference.get()) == null) {
            return;
        }
        tBPublicMenuItemObserver.onItemDataChanged(this);
    }

    /* loaded from: classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TBPublicMenuItem mMenuItem = new TBPublicMenuItem();

        static {
            kge.a(-2006920494);
        }

        public int getId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.mMenuItem.getId();
        }

        public Builder setId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c516b7e", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.setId(i);
            return this;
        }

        public Builder setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("531f2c46", new Object[]{this, str});
            }
            this.mMenuItem.setTitle(str);
            return this;
        }

        public Builder setNavUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b67aa77e", new Object[]{this, str});
            }
            this.mMenuItem.setNavUrl(str);
            return this;
        }

        public Builder setUTControlName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4dcc9c37", new Object[]{this, str});
            }
            this.mMenuItem.setUTControlName(str);
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("38de36c5", new Object[]{this, drawable});
            }
            this.mMenuItem.setIconDrawable(drawable);
            return this;
        }

        public Builder setOrder(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa712f6f", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.setOrder(i);
            return this;
        }

        public Builder setIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ed6cf2eb", new Object[]{this, str});
            }
            this.mMenuItem.setIconUrl(str);
            return this;
        }

        public Builder setMessageMode(MessageMode messageMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fa1b2f10", new Object[]{this, messageMode});
            }
            this.mMenuItem.setMessageMode(messageMode);
            return this;
        }

        public Builder setMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5efb2bb5", new Object[]{this, str});
            }
            this.mMenuItem.setMessage(str);
            return this;
        }

        public Builder setNeedLogin(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("81dba23b", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.setNeedLogin(z);
            return this;
        }

        public Builder setMenuNeedtoBeClosedAfterItemClicked(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5c6961b3", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.setMenuNeedToBeClosed(z);
            return this;
        }

        public Builder setImageTipUri(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d362da7a", new Object[]{this, str});
            }
            this.mMenuItem.mImgTipsUri = str;
            return this;
        }

        public Builder setImageTipResource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("24e7ee0b", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.mImageTipResource = Integer.valueOf(i);
            return this;
        }

        public Builder setSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3170217e", new Object[]{this, new Integer(i)});
            }
            this.mMenuItem.mSource = i;
            return this;
        }

        public Builder setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1388b27d", new Object[]{this, str});
            }
            this.mMenuItem.mName = str;
            return this;
        }

        public Builder setI18nSupported(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("645d2c1e", new Object[]{this, new Boolean(z)});
            }
            this.mMenuItem.isI18nSupported = z;
            return this;
        }

        public TBPublicMenuItem build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenuItem) ipChange.ipc$dispatch("30f4280b", new Object[]{this});
            }
            if (this.mMenuItem.checkValidation()) {
                return this.mMenuItem;
            }
            return null;
        }
    }
}
