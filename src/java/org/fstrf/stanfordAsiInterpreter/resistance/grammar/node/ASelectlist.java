/**
Copyright 2017 Frontier Science & Technology Research Foundation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ADDITIONAL DISCLAIMER:
In addition to the standard warranty exclusions and limitations of 
liability set forth in sections 7, 8 and 9 of the Apache 2.0 license 
that governs the use and development of this software, Frontier Science 
& Technology Research Foundation disclaims any liability for use of 
this software for patient care or in clinical settings. This software 
was developed solely for use in medical and public health research, and 
was not intended, designed, or validated to guide patient care.
*/ 



/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.node;

import java.util.*;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.*;

public final class ASelectlist extends PSelectlist
{
    private PResidue _residue_;
    private final LinkedList _listitems_ = new TypedLinkedList(new Listitems_Cast());

    public ASelectlist()
    {
    }

    public ASelectlist(
        PResidue _residue_,
        List _listitems_)
    {
        setResidue(_residue_);

        {
            this._listitems_.clear();
            this._listitems_.addAll(_listitems_);
        }

    }
    public Object clone()
    {
        return new ASelectlist(
            (PResidue) cloneNode(_residue_),
            cloneList(_listitems_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASelectlist(this);
    }

    public PResidue getResidue()
    {
        return _residue_;
    }

    public void setResidue(PResidue node)
    {
        if(_residue_ != null)
        {
            _residue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _residue_ = node;
    }

    public LinkedList getListitems()
    {
        return _listitems_;
    }

    public void setListitems(List list)
    {
        _listitems_.clear();
        _listitems_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_residue_)
            + toString(_listitems_);
    }

    void removeChild(Node child)
    {
        if(_residue_ == child)
        {
            _residue_ = null;
            return;
        }

        if(_listitems_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_residue_ == oldChild)
        {
            setResidue((PResidue) newChild);
            return;
        }

        for(ListIterator i = _listitems_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Listitems_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PListitems node = (PListitems) o;

            if((node.parent() != null) &&
                (node.parent() != ASelectlist.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != ASelectlist.this))
            {
                node.parent(ASelectlist.this);
            }

            return node;
        }
    }
}