package com.xuecheng.managecms.client.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: 98050
 * @Time: 2019-03-19 22:10
 * @Feature: mongodb  repository
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
