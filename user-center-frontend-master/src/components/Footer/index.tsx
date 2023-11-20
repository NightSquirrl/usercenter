import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';
import {PLANET_LINK} from "@/constants";

const Footer: React.FC = () => {
  const defaultMessage = 'Whattols';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[

        {
          key: 'codeNav',
          title: '个人博客地址',
          href: PLANET_LINK,
          blankTarget: true,
        },
        {
          key: 'github',
          title: <><GithubOutlined/> WhatTools GitHub</>,
          href: 'https://github.com/NightSquirrl',
          blankTarget: true,
        },

      ]}
    />
  );
};

export default Footer;
