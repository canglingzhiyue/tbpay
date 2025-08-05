package com.taobao.share.core.contacts.mtop.response;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoGetContactsMessageResponseData implements Serializable, IMTOPDataObject {
    private DataBean data;
    public String shareTraceId;

    static {
        kge.a(1632889026);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getShareTraceId() {
        return this.shareTraceId;
    }

    public void setShareTraceId(String str) {
        this.shareTraceId = str;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes8.dex */
    public static class DataBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String abtestParam;
        private List<ContactsBean> contacts;
        public String pvid;
        private String recPicUrl;
        public String scm;
        private BubbleTipsBean tips;

        static {
            kge.a(1649239100);
            kge.a(1028243835);
        }

        public String getAbtestParam() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d92fe695", new Object[]{this}) : this.abtestParam;
        }

        public void setAbtestParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64841ae9", new Object[]{this, str});
            } else {
                this.abtestParam = str;
            }
        }

        public String getPvid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("813f1942", new Object[]{this}) : this.pvid;
        }

        public void setPvid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b234f74", new Object[]{this, str});
            } else {
                this.pvid = str;
            }
        }

        public String getScm() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1429a872", new Object[]{this}) : this.scm;
        }

        public void setScm(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
            } else {
                this.scm = str;
            }
        }

        public BubbleTipsBean getTips() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BubbleTipsBean) ipChange.ipc$dispatch("48ba9f81", new Object[]{this}) : this.tips;
        }

        public void setTips(BubbleTipsBean bubbleTipsBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c81e87b", new Object[]{this, bubbleTipsBean});
            } else {
                this.tips = bubbleTipsBean;
            }
        }

        public List<ContactsBean> getContacts() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ff466277", new Object[]{this}) : this.contacts;
        }

        public void setContacts(List<ContactsBean> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf2965cd", new Object[]{this, list});
            } else {
                this.contacts = list;
            }
        }

        public String getRecPicUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("737142da", new Object[]{this}) : this.recPicUrl;
        }

        public void setRecPicUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf4d444", new Object[]{this, str});
            } else {
                this.recPicUrl = str;
            }
        }

        /* loaded from: classes8.dex */
        public static class ContactsBean implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String bizSubType;
            private String ccode;
            private String contactType;
            private String dataType;
            private String displayName;
            private ExtraBean extra;
            private String groupId;
            private String groupUserNum;
            private String headIcon;
            private String headUrl;
            private String isFriend;
            private String isGuideSaoHuo;
            private String mobilePhone;
            private String nick;
            private String oldGroupId;
            private String recordNum;
            private String shareChannel;
            private String sourceType;
            private String updateTime;
            private String userId;

            static {
                kge.a(-151576021);
                kge.a(1028243835);
            }

            public String getSourceType() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c62001ee", new Object[]{this}) : this.sourceType;
            }

            public boolean isFromRecommend() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36e01fb3", new Object[]{this})).booleanValue() : TextUtils.equals("2", this.sourceType);
            }

            public void setSourceType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("74c9c348", new Object[]{this, str});
                } else {
                    this.sourceType = str;
                }
            }

            public String getHeadIcon() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ad7e6a", new Object[]{this}) : this.headIcon;
            }

            public void setHeadIcon(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7edfa94c", new Object[]{this, str});
                } else {
                    this.headIcon = str;
                }
            }

            public String getIsGuideSaoHuo() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("83e00adc", new Object[]{this}) : this.isGuideSaoHuo;
            }

            public void setIsGuideSaoHuo(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2cc13282", new Object[]{this, str});
                } else {
                    this.isGuideSaoHuo = str;
                }
            }

            public String getDisplayName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9684a22", new Object[]{this}) : this.displayName;
            }

            public void setDisplayName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4b5828fc", new Object[]{this, str});
                } else {
                    this.displayName = str;
                }
            }

            public String getDataType() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this}) : this.dataType;
            }

            public void setDataType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("db3e1e97", new Object[]{this, str});
                } else {
                    this.dataType = str;
                }
            }

            public String getGroupId() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.groupId;
            }

            public void setGroupId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
                } else {
                    this.groupId = str;
                }
            }

            public String getHeadUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this}) : this.headUrl;
            }

            public void setHeadUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd0877e", new Object[]{this, str});
                } else {
                    this.headUrl = str;
                }
            }

            public String getUpdateTime() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6422f74d", new Object[]{this}) : this.updateTime;
            }

            public void setUpdateTime(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("972579c9", new Object[]{this, str});
                } else {
                    this.updateTime = str;
                }
            }

            public String getContactType() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38d12335", new Object[]{this}) : this.contactType;
            }

            public void setContactType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f90a7249", new Object[]{this, str});
                } else {
                    this.contactType = str;
                }
            }

            public String getUserId() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
            }

            public void setUserId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
                } else {
                    this.userId = str;
                }
            }

            public String getRecordNum() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a26219a", new Object[]{this}) : this.recordNum;
            }

            public void setRecordNum(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4cdbcd84", new Object[]{this, str});
                } else {
                    this.recordNum = str;
                }
            }

            public String getNick() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this}) : this.nick;
            }

            public void setNick(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
                } else {
                    this.nick = str;
                }
            }

            public String getBizSubType() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("605761c", new Object[]{this}) : this.bizSubType;
            }

            public void setBizSubType(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3192d4da", new Object[]{this, str});
                } else {
                    this.bizSubType = str;
                }
            }

            public String getCcode() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f01981f", new Object[]{this}) : this.ccode;
            }

            public void setCcode(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4e0a019f", new Object[]{this, str});
                } else {
                    this.ccode = str;
                }
            }

            public String getOldGroupId() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76182d0", new Object[]{this}) : this.oldGroupId;
            }

            public void setOldGroupId(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bb85ea6", new Object[]{this, str});
                } else {
                    this.oldGroupId = str;
                }
            }

            public String getMobilePhone() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c8dc403", new Object[]{this}) : this.mobilePhone;
            }

            public void setMobilePhone(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7ce1eb3b", new Object[]{this, str});
                } else {
                    this.mobilePhone = str;
                }
            }

            public ExtraBean getExtra() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ExtraBean) ipChange.ipc$dispatch("8bc07b1d", new Object[]{this}) : this.extra;
            }

            public void setExtra(ExtraBean extraBean) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6c25de1d", new Object[]{this, extraBean});
                } else {
                    this.extra = extraBean;
                }
            }

            public String getShareChannel() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8731a49f", new Object[]{this}) : this.shareChannel;
            }

            public void setShareChannel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("efa163b7", new Object[]{this, str});
                } else {
                    this.shareChannel = str;
                }
            }

            public String getIsFriend() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97636bdb", new Object[]{this}) : this.isFriend;
            }

            public void setIsFriend(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dfe769fb", new Object[]{this, str});
                } else {
                    this.isFriend = str;
                }
            }

            public String getGroupUserNum() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e94b87", new Object[]{this}) : this.groupUserNum;
            }

            public void setGroupUserNum(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("66de99cf", new Object[]{this, str});
                } else {
                    this.groupUserNum = str;
                }
            }

            /* loaded from: classes8.dex */
            public static class ExtraBean implements Serializable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private String friendType;
                private GuideSaoHuoDataBean guideSaoHuoData;
                private String possibleFriendSource;
                private String topSortFactor;

                static {
                    kge.a(318981255);
                    kge.a(1028243835);
                }

                /* loaded from: classes8.dex */
                public static class GuideSaoHuoDataBean implements Serializable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private String isShow;
                    private String link;
                    private String text;

                    static {
                        kge.a(31626586);
                        kge.a(1028243835);
                    }

                    public String getLink() {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this}) : this.link;
                    }

                    public void setLink(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
                        } else {
                            this.link = str;
                        }
                    }

                    public String getText() {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.text;
                    }

                    public void setText(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
                        } else {
                            this.text = str;
                        }
                    }

                    public String getIsShow() {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84b50cdc", new Object[]{this}) : this.isShow;
                    }

                    public void setIsShow(String str) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("b1967c1a", new Object[]{this, str});
                        } else {
                            this.isShow = str;
                        }
                    }
                }

                public GuideSaoHuoDataBean getGuideSaoHuoData() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (GuideSaoHuoDataBean) ipChange.ipc$dispatch("b116af53", new Object[]{this}) : this.guideSaoHuoData;
                }

                public void setGuideSaoHuoData(GuideSaoHuoDataBean guideSaoHuoDataBean) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a19fdd61", new Object[]{this, guideSaoHuoDataBean});
                    } else {
                        this.guideSaoHuoData = guideSaoHuoDataBean;
                    }
                }

                public String getPossibleFriendSource() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ef53219", new Object[]{this}) : this.possibleFriendSource;
                }

                public void setPossibleFriendSource(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("83fab97d", new Object[]{this, str});
                    } else {
                        this.possibleFriendSource = str;
                    }
                }

                public String getFriendType() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29a28cb", new Object[]{this}) : this.friendType;
                }

                public void setFriendType(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c794780b", new Object[]{this, str});
                    } else {
                        this.friendType = str;
                    }
                }

                public String getTopSortFactor() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3a2ce6d", new Object[]{this}) : this.topSortFactor;
                }

                public void setTopSortFactor(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("556e111", new Object[]{this, str});
                    } else {
                        this.topSortFactor = str;
                    }
                }
            }
        }
    }
}
