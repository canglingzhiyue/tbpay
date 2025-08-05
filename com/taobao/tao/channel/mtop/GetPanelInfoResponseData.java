package com.taobao.tao.channel.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetPanelInfoResponseData implements IMTOPDataObject {
    private String activityUrl;
    private String bgImageUrl;
    private String bizCode;
    private List<ChannelListBean> channelList;
    private String extendParams;
    private int isBabaVipUser;
    private String isSuperUser;
    private String longPicDesc;
    private String longPicType;
    private String needShowAvatar;
    private String openMultiTargetUrl;
    private int panelType;
    private String priority;
    private String promotionUrl;
    public String shareDataTrack;
    private String showChannelType;
    private boolean showFriend;
    private String showFriendType;
    private String templateId;
    private TemplateParamsBean templateParams;
    private List<ToolListBean> toolList;
    private String version;

    static {
        kge.a(1940785346);
        kge.a(-350052935);
    }

    public String getShowFriendType() {
        return this.showFriendType;
    }

    public void setShowFriendType(String str) {
        this.showFriendType = str;
    }

    public String getShowChannelType() {
        return this.showChannelType;
    }

    public void setShowChannelType(String str) {
        this.showChannelType = str;
    }

    public int getPanelType() {
        return this.panelType;
    }

    public void setPanelType(int i) {
        this.panelType = i;
    }

    public String getActivityUrl() {
        return this.activityUrl;
    }

    public void setActivityUrl(String str) {
        this.activityUrl = str;
    }

    public int getIsBabaVipUser() {
        return this.isBabaVipUser;
    }

    public void setIsBabaVipUser(int i) {
        this.isBabaVipUser = i;
    }

    public String getExtendParams() {
        return this.extendParams;
    }

    public void setExtendParams(String str) {
        this.extendParams = str;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public String getLongPicType() {
        return this.longPicType;
    }

    public void setLongPicType(String str) {
        this.longPicType = str;
    }

    public boolean getShowFriend() {
        return this.showFriend;
    }

    public void setShowFriend(boolean z) {
        this.showFriend = z;
    }

    public String getNeedShowAvatar() {
        return this.needShowAvatar;
    }

    public void setNeedShowAvatar(String str) {
        this.needShowAvatar = str;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String str) {
        this.priority = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getPromotionUrl() {
        return this.promotionUrl;
    }

    public void setPromotionUrl(String str) {
        this.promotionUrl = str;
    }

    public String getLongPicDesc() {
        return this.longPicDesc;
    }

    public void setLongPicDesc(String str) {
        this.longPicDesc = str;
    }

    public String getBgImageUrl() {
        return this.bgImageUrl;
    }

    public void setBgImageUrl(String str) {
        this.bgImageUrl = str;
    }

    public String getIsSuperUser() {
        return this.isSuperUser;
    }

    public void setIsSuperUser(String str) {
        this.isSuperUser = str;
    }

    public List<ChannelListBean> getChannelList() {
        return this.channelList;
    }

    public void setChannelList(List<ChannelListBean> list) {
        this.channelList = list;
    }

    public TemplateParamsBean getTemplateParams() {
        return this.templateParams;
    }

    public void setTemplateParams(TemplateParamsBean templateParamsBean) {
        this.templateParams = templateParamsBean;
    }

    public List<ToolListBean> getToolList() {
        return this.toolList;
    }

    public void setToolList(List<ToolListBean> list) {
        this.toolList = list;
    }

    public String getOpenMultiTargetUrl() {
        return this.openMultiTargetUrl;
    }

    public void setOpenMultiTargetUrl(String str) {
        this.openMultiTargetUrl = str;
    }

    /* loaded from: classes8.dex */
    public static class ToolListBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DEFINE = "2";
        public static final String OFFICE = "1";
        private String action;
        private String icon;
        private String mark;
        private String name;
        private String title;
        private String toolSource;
        private String toolUrl;
        private String type;

        static {
            kge.a(-66031640);
            kge.a(1028243835);
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
        }

        public void setName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            } else {
                this.name = str;
            }
        }

        public String getIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.icon;
        }

        public void setIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
            } else {
                this.icon = str;
            }
        }

        public String getMark() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91f3f796", new Object[]{this}) : this.mark;
        }

        public void setMark(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("410a3ba0", new Object[]{this, str});
            } else {
                this.mark = str;
            }
        }

        public String getAction() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.action;
        }

        public void setAction(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
            } else {
                this.action = str;
            }
        }

        public String getToolSource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d59b2d0", new Object[]{this}) : this.toolSource;
        }

        public void setToolSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c62ea6", new Object[]{this, str});
            } else {
                this.toolSource = str;
            }
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public String getToolUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a4a118", new Object[]{this}) : this.toolUrl;
        }

        public void setToolUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96f30ac6", new Object[]{this, str});
            } else {
                this.toolUrl = str;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class ChannelListBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String action;
        private String channelSource;
        private String icon;
        private String mark;
        private String priority;
        private String title;
        private String topIcon;
        private String type;

        static {
            kge.a(-1333717105);
            kge.a(1028243835);
        }

        public String getIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.icon;
        }

        public void setIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
            } else {
                this.icon = str;
            }
        }

        public String getAction() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.action;
        }

        public void setAction(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
            } else {
                this.action = str;
            }
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }

        public String getPriority() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f425cc1f", new Object[]{this}) : this.priority;
        }

        public void setPriority(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b711237", new Object[]{this, str});
            } else {
                this.priority = str;
            }
        }

        public String getMark() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91f3f796", new Object[]{this}) : this.mark;
        }

        public void setMark(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("410a3ba0", new Object[]{this, str});
            } else {
                this.mark = str;
            }
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public String getChannelSource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c45b8cb1", new Object[]{this}) : this.channelSource;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public void setChannelSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbb5eb4d", new Object[]{this, str});
            } else {
                this.channelSource = str;
            }
        }

        public String getTopIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea6fe6c1", new Object[]{this}) : this.topIcon;
        }

        public void setTopIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a907a3d", new Object[]{this, str});
            } else {
                this.topIcon = str;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class TemplateParamsBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String brandIcon;
        private String description;
        private String extParams;
        private String headImg;
        private List<String> images;
        private String levelIcon;
        private String price;
        private String qrcodeUrl;
        private String statusIcon;
        private List<String> tags;
        private String title;
        private String userNick;
        private String validDate;

        static {
            kge.a(161746354);
            kge.a(1028243835);
        }

        public String getExtParam() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54ad97d7", new Object[]{this}) : this.extParams;
        }

        public void setExtParams(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d70bed96", new Object[]{this, str});
            } else {
                this.extParams = str;
            }
        }

        public List<String> getImages() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("36c826b2", new Object[]{this}) : this.images;
        }

        public void setImages(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cb57bf2", new Object[]{this, list});
            } else {
                this.images = list;
            }
        }

        public List<String> getTags() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("248771f1", new Object[]{this}) : this.tags;
        }

        public void setTags(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6edab93", new Object[]{this, list});
            } else {
                this.tags = list;
            }
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public String getDescription() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this}) : this.description;
        }

        public void setDescription(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97e6b14b", new Object[]{this, str});
            } else {
                this.description = str;
            }
        }

        public String getUserNick() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this}) : this.userNick;
        }

        public void setUserNick(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("236ed6e1", new Object[]{this, str});
            } else {
                this.userNick = str;
            }
        }

        public String getHeadImg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ea1578c", new Object[]{this}) : this.headImg;
        }

        public void setHeadImg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c8d22d2", new Object[]{this, str});
            } else {
                this.headImg = str;
            }
        }

        public String getPrice() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3a46146", new Object[]{this}) : this.price;
        }

        public void setPrice(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
            } else {
                this.price = str;
            }
        }

        public String getStatusIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("acc5aa18", new Object[]{this}) : this.statusIcon;
        }

        public void setStatusIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62d9205e", new Object[]{this, str});
            } else {
                this.statusIcon = str;
            }
        }

        public String getBrandIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7f9134f", new Object[]{this}) : this.brandIcon;
        }

        public void setBrandIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a967126f", new Object[]{this, str});
            } else {
                this.brandIcon = str;
            }
        }

        public String getLevelIcon() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91bfc9f2", new Object[]{this}) : this.levelIcon;
        }

        public void setLevelIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2877302c", new Object[]{this, str});
            } else {
                this.levelIcon = str;
            }
        }

        public String getQrcodeUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7bc6338e", new Object[]{this}) : this.qrcodeUrl;
        }

        public void setQrcodeUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f3dfa10", new Object[]{this, str});
            } else {
                this.qrcodeUrl = str;
            }
        }

        public String getValidDate() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8cde1c65", new Object[]{this}) : this.validDate;
        }

        public void setValidDate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91232c19", new Object[]{this, str});
            } else {
                this.validDate = str;
            }
        }
    }
}
