package com.taobao.desktop.widget.template.gold;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TaoGoldData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtDate ext;
    private String imageUrl;
    private long nextRefreshTime;

    static {
        kge.a(134323789);
        kge.a(1028243835);
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this}) : this.deepLink;
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.imageUrl;
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.imageUrl = str;
        }
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue() : this.nextRefreshTime;
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public ExtDate getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtDate) ipChange.ipc$dispatch("b864272b", new Object[]{this}) : this.ext;
    }

    public void setExt(ExtDate extDate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5771a3", new Object[]{this, extDate});
        } else {
            this.ext = extDate;
        }
    }

    /* loaded from: classes7.dex */
    public static class ExtDate implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private CoinBalanceData coinBalance;
        private List<CoinBallData> coinBall;
        private String line1;
        private String line2;
        private String line3;
        private MessageData message;
        private String template;

        static {
            kge.a(-48636424);
            kge.a(1028243835);
        }

        public String getTemplate() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca44bb09", new Object[]{this}) : this.template;
        }

        public void setTemplate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("930008d", new Object[]{this, str});
            } else {
                this.template = str;
            }
        }

        public String getLine1() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63cd7452", new Object[]{this}) : this.line1;
        }

        public void setLine1(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b9abcc", new Object[]{this, str});
            } else {
                this.line1 = str;
            }
        }

        public String getLine2() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea532ef1", new Object[]{this}) : this.line2;
        }

        public void setLine2(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ceb450d", new Object[]{this, str});
            } else {
                this.line2 = str;
            }
        }

        public String getLine3() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70d8e990", new Object[]{this}) : this.line3;
        }

        public void setLine3(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("571cde4e", new Object[]{this, str});
            } else {
                this.line3 = str;
            }
        }

        public List<CoinBallData> getCoinBall() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bf09fb7a", new Object[]{this}) : this.coinBall;
        }

        public void setCoinBall(List<CoinBallData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7d8ed2a", new Object[]{this, list});
            } else {
                this.coinBall = list;
            }
        }

        public CoinBalanceData getCoinBalance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CoinBalanceData) ipChange.ipc$dispatch("5385afa4", new Object[]{this}) : this.coinBalance;
        }

        public void setCoinBalance(CoinBalanceData coinBalanceData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("261cd7c8", new Object[]{this, coinBalanceData});
            } else {
                this.coinBalance = coinBalanceData;
            }
        }

        public MessageData getMessage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageData) ipChange.ipc$dispatch("48f22724", new Object[]{this}) : this.message;
        }

        public void setMessage(MessageData messageData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aca7750", new Object[]{this, messageData});
            } else {
                this.message = messageData;
            }
        }

        /* loaded from: classes7.dex */
        public static class CoinBallData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String amount;
            private String desc;
            private String img;

            static {
                kge.a(-1347152058);
                kge.a(1028243835);
            }

            public String getAmount() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12ae786b", new Object[]{this}) : this.amount;
            }

            public void setAmount(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e2ca826b", new Object[]{this, str});
                } else {
                    this.amount = str;
                }
            }

            public String getDesc() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.desc;
            }

            public void setDesc(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eb9c4864", new Object[]{this, str});
                } else {
                    this.desc = str;
                }
            }

            public String getImg() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fae7b08c", new Object[]{this}) : this.img;
            }

            public void setImg(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("509b43d2", new Object[]{this, str});
                } else {
                    this.img = str;
                }
            }
        }

        /* loaded from: classes7.dex */
        public static class CoinBalanceData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String amount;
            private String coinIcon;

            static {
                kge.a(134464137);
                kge.a(1028243835);
            }

            public String getAmount() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12ae786b", new Object[]{this}) : this.amount;
            }

            public void setAmount(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e2ca826b", new Object[]{this, str});
                } else {
                    this.amount = str;
                }
            }

            public String getCoinIcon() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b84e16d9", new Object[]{this}) : this.coinIcon;
            }

            public void setCoinIcon(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc521ebd", new Object[]{this, str});
                } else {
                    this.coinIcon = str;
                }
            }
        }

        /* loaded from: classes7.dex */
        public static class MessageData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String bgImg;
            private boolean bullet;
            private String content;

            static {
                kge.a(-1887986811);
                kge.a(1028243835);
            }

            public String getContent() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
            }

            public void setContent(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
                } else {
                    this.content = str;
                }
            }

            public boolean isBullet() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fc09557", new Object[]{this})).booleanValue() : this.bullet;
            }

            public void setBullet(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1c99e5a9", new Object[]{this, new Boolean(z)});
                } else {
                    this.bullet = z;
                }
            }

            public String getBgImg() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e781c71", new Object[]{this}) : this.bgImg;
            }

            public void setBgImg(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ed64078d", new Object[]{this, str});
                } else {
                    this.bgImg = str;
                }
            }
        }
    }
}
