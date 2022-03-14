package de.sqrls.ratatoskr.core;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
/**
 * This file is part of Ratatoskr ECOM.
 * Copyright (C) 2020  SQRL SOLUTIONS UG
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public interface IArchive<Model extends IBaseModel> {

    public Optional<Model> create(Model data);

    public Optional<Model> update(Model data);

    public Optional<Model> delete(Model data);

    public Optional<Model> findOne(Model data);

    public Optional<Model> findOneById(String id);

    public Page<Model> findMany(Model search, Pageable page);

}
